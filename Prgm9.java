import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class StudentMarksServlet extends HttpServlet {
 String message, USN;
 Connection connect;
 Statement stmt = null;
 ResultSet rs = null;
 public void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 try {
 String url = "jdbc:odbc:NEO";
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 connect = DriverManager.getConnection(url, " ", " ");
 message = "Memorandum of Marks";
 } catch (ClassNotFoundException cnfex) {
 cnfex.printStackTrace();
 } catch (SQLException sqlex) {
 sqlex.printStackTrace();
 } catch (Exception excp) {
 excp.printStackTrace();
 }
 USN = request.getParameter("usn");
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html>");
 out.println("<head>");
 out.println("</head>");
 out.println("<body bgcolor=cyan>");
 out.println("<center>");
 out.println("<h1>" + message + "</h1>\\n");
 try {
 stmt = connect.createStatement();
 String query = new String("SELECT * FROM StudentMarks WHERE USN=" + USN);
 rs = stmt.executeQuery(query);
 boolean b = rs.next();
 out.println("USN: " + rs.getString(1));
 out.println("<br>" + "Name: " + rs.getString(2));
 out.println("<br>" + "Total Marks: " + rs.getInt(3));
 } catch (SQLException ex) {
 out.println("error in connection");
 } finally {
 try {
    if (rs != null)
 rs.close();
 if (stmt != null)
 stmt.close();
 if (connect != null)
 connect.close();
 } catch (SQLException e) {
 }
 }
 out.println("</center>");
 out.println("</body></html>");
 }
}
