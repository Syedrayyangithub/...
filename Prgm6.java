public class Prgm6 {
    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello World!");
    // Length method
    System.out.println("Length: " + sb.length());
    // Capacity method
 System.out.println("Capacity: " + sb.capacity());
 // Set length method
 sb.setLength(10);
 System.out.println("Set length to 10: " + sb);
 // Ensure capacity method
 sb.ensureCapacity(20);
 System.out.println("Ensure capacity of 20: " + sb.capacity());
 // Insert method
 sb.insert(5, " Java");
 System.out.println("Insert ' Java' at index 5: " + sb);
 // Delete method
 sb.delete(5, 10);
 System.out.println("Delete from index 5 to 10: " + sb);
 // Reverse method
 sb.reverse();
 System.out.println("Reverse: " + sb);
 // Append method
 sb.append(" and goodbye");
 System.out.println("Append ' and goodbye': " + sb);
 // Insert method (with object)
 sb.insert(0, "Hello ");
 System.out.println("Insert 'Hello ' at index 0: " + sb);
 // DeleteCharAt method
 sb.deleteCharAt(5);
 System.out.println("Delete char at index 5: " + sb);
 // Replace method
 sb.replace(0, 5, "Hi");
 System.out.println("Replace 'Hello ' with 'Hi': " + sb);
 }
}

