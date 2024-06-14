public class Prgm5 {
    public static void main(String[] args) {
    String str = "Hello World!";
    // Character extraction methods
    System.out.println("Character at index 0: " + str.charAt(0));
    System.out.println("First occurrence of 'l': " + str.indexOf('l'));
    System.out.println("Last occurrence of 'l': " + str.lastIndexOf('l'));
    System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));
    // String comparison methods
    String str1 = "Hello World!";
    String str2 = "hello world!";
    System.out.println("Equal ignoring case: " + str1.equalsIgnoreCase(str2));
    System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));
    System.out.println("Ends with '!': " + str1.endsWith("!"));
    // String search methods
    System.out.println("Contains 'World': " + str1.contains("World"));
    System.out.println("Index of '!': " + str1.indexOf('!'));
    System.out.println("Last index of 'l': " + str1.lastIndexOf('l'));
    // String modification methods
    System.out.println("Uppercase: " + str1.toUpperCase());
    System.out.println("Lowercase: " + str1.toLowerCase());
    System.out.println("Trim: " + " Hello World! ".trim());
 System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));
 System.out.println("Concatenate ' and goodbye': " + str1.concat(" and goodbye"));
 }
}
