import java.util.ArrayList;
import java.util.List;
class Student {
 private String name;
 private int age;
 public Student(String name, int age) {
 this.name = name;
 this.age = age;
 }
 public String getName() {
 return name;
 }
 public int getAge() {
 return age;
 }
 @Override
 public String toString() {
 return "Student{" +
 "name='" + name + '\'' +
 ", age=" + age +
 '}';
 }
}
public class Prgm3 {
 public static void main(String[] args) {
 List<Student> students = new ArrayList<>();
 // Add students to the list
 students.add(new Student("Alice", 20));
 students.add(new Student("Bob", 22));
 students.add(new Student("Charlie", 23));
 // Print the students
 for (Student student : students) {
 System.out.println(student);
 }
 }
}