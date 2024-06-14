Login.jsp :
 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>Login</title>
</head>
<body>
 <form method="post" action="login">
 User ID: <input type="text" name="userid"><br>
 Password: <input type="password" name="password"><br>
 <input type="submit" value="Login">
 </form>
</body>
</html>
Loginservlet.java:
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {
 private static final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
 private static final String DB_USER = "root";
 private static final String DB_PASSWORD = "password";
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 String userid = request.getParameter("userid");
 String password = request.getParameter("password");
 try {
 // Step 1: Register JDBC driver
 Class.forName("com.mysql.cj.jdbc.Driver");
 // Step 2: Open a connection
 Connection conn = DriverManager.getConnection(DB_URL, DB_USER,
DB_PASSWORD);
 // Step 3: Execute a query
 Statement stmt = conn.createStatement();
 // Validate user ID and password
 String sql = "SELECT * FROM users WHERE userid = '" + userid + "' AND password = '" +
password + "'";
 ResultSet rs = stmt.executeQuery(sql);
 if (rs.next()) {
 // User is valid, redirect to welcome page
 RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
 rd.forward(request, response);
 } else {
 // User is not valid, show error message
 request.setAttribute("error", "Invalid user ID or password");
 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
 rd.forward(request, response);
 }
 // Step 4: Close the connection
 conn.close();
} catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace();
    }
    }
   }
   Welcome.jsp:
   <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!DOCTYPE html>
   <html>
   <head>
    <title>Welcome</title>
   </head>
   <body>
    <h1>Welcome, ${userid}!</h1>
    <p><a href="logout">Logout</a></p>
   </body>
   </html>
   Logoutservlet.java:
   import java.io.*;
   import javax.servlet.*;
   import javax.servlet.http.*;
   public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    // Clear session
    request.getSession().invalidate();
    // Redirect to login page
    response.sendRedirect("login.jsp");
    }
   }