public class Prgm4 {
    public static void main(String[] args) {
    // 1. Default constructor: Creates a new empty string
    String str1 = new String();
    System.out.println("Default constructor: " + str1);
    // 2. Constructor with a string argument: Creates a new string with the specified value
    String str2 = new String("Hello, World!");
    System.out.println("Constructor with a string argument: " + str2);
    // 3. Constructor with a character array: Creates a new string with the specified character array
    char[] charArray = {'H', 'e', 'l', 'l', 'o'};
    String str3 = new String(charArray);
    System.out.println("Constructor with a character array: " + str3);
    // 4. Constructor with a character array and offset: Creates a new string with the specified character array and offset
char[] charArrayOffset = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
String str4 = new String(charArrayOffset, 7, 5);
System.out.println("Constructor with a character array and offset: " + str4);
// 5. Constructor with a byte array: Creates a new string with the specified byte array
byte[] byteArray = {72, 101, 108, 108, 111};
String str5 = new String(byteArray);
System.out.println("Constructor with a byte array: " + str5);
// 6. Constructor with a byte array and charset: Creates a new string with the specified byte array and charset
byte[] byteArrayCharset = {72, 101, 108, 108, 111};
String str6 = new String(byteArrayCharset, "UTF-8");
System.out.println("Constructor with a byte array and charset: " + str6);
// 7. Constructor with a byte array, offset, and length: Creates a new string with the specified byte array, offset, and length
byte[] byteArrayOffset = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
String str7 = new String(byteArrayOffset, 7, 5);
System.out.println("Constructor with a byte array, offset, and length: " + str7);
// 8. Constructor with a byte array, offset, length, and charset: Creates a new string with the specified byte array, offset, length, and charset
byte[] byteArrayOffsetCharset = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
String str8 = new String(byteArrayOffsetCharset, 7, 5, "UTF-8");
System.out.println("Constructor with a byte array, offset, length, and charset: " + str8);
}
}
