import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Prgm1 {
 public static void main(String[] args) {
 // Create an ArrayList
 ArrayList<Integer> arrayList = new ArrayList<>();
 // Add elements to the ArrayList
 arrayList.add(5);
 arrayList.add(2);
 arrayList.add(8);
 arrayList.add(1);
 arrayList.add(9);
 System.out.println("Initial ArrayList: " + arrayList);
 // Remove an element from the ArrayList
 arrayList.remove(1);
 System.out.println("ArrayList after removing an element: " + arrayList);
 // Sort the ArrayList
 Collections.sort(arrayList);
 System.out.println("Sorted ArrayList: " + arrayList);
 // Convert the ArrayList to an array
 Integer[] array = arrayList.toArray(new Integer[0]);
 System.out.println("Array: " + Arrays.toString(array));
 }
}
