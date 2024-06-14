import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
public class Prgm2 {
 public static void main(String[] args) {
 ArrayList<Integer> numbers = new ArrayList<>();
 Random random = new Random();
 // Generate random numbers between 10 and 100 that are multiples of 2 and 5
 while (numbers.size() < 10) {
 int number = random.nextInt(41) * 5;
 if (number % 2 == 0 && number >= 10 && number <= 100) {
 numbers.add(number);
 }
 }
 // Sort the numbers according to the tens place
 Collections.sort(numbers, new Comparator<Integer>() {
 @Override
 public int compare(Integer o1, Integer o2) {
 return Integer.compare(o1 / 10, o2 / 10);
 }
 });
 // Print the sorted numbers
 for (int number : numbers) {
 System.out.println(number);
 }
 }
}