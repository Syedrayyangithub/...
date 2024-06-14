import java.sql.*;
public class StudentDatabase {
 private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
 private static final String DB_USER = "root";
 private static final String DB_PASSWORD = "password";
 public static void main(String[] args) {
 try {
 // Step 1: Register JDBC driver
 Class.forName("com.mysql.cj.jdbc.Driver");
 // Step 2: Open a connection
 Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
 // Step 3: Execute a query
 Statement stmt = conn.createStatement();
 // Insert a new student
 String sql = "INSERT INTO students (id, name, age) VALUES (1, 'John Doe', 20)";
 stmt.executeUpdate(sql);
 System.out.println("Student added successfully.");
 // Update a student's age
 sql = "UPDATE students SET age = 21 WHERE id = 1";
 stmt.executeUpdate(sql);
 System.out.println("Student updated successfully.");
 // Search for a student by name
 sql = "SELECT * FROM students WHERE name = 'John Doe'";
 ResultSet rs = stmt.executeQuery(sql);
 while (rs.next()) {
 System.out.println("ID: " + rs.getInt("id"));