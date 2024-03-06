import java.util.Scanner;
import java.util.Arrays;

public class MaxMinDifference {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter the number of elements in the array: ");
   int n = input.nextInt();
   int[] array = new int[n];

   System.out.println("Enter the elements of the array:");
   for (int i = 0; i < n; i++) {
     array[i] = input.nextInt();
   }

   Arrays.sort(array);

   int minDifference = array[1] - array[0];
   int maxDifference = array[n - 1] - array[0];
   int minIndex = 0, maxIndex = 0;

   for (int i = 0; i < n - 1; i++) {
     int difference = array[i + 1] - array[i];
     if (difference < minDifference) {
       minDifference = difference;
       minIndex = i;
     }
     if (difference > maxDifference) {
       maxDifference = difference;
       maxIndex = i;
     }
   }

   System.out.println("Pair with maximum difference: " + array[maxIndex] + ", " + array[maxIndex + 1]
           + " with difference " + maxDifference);
   System.out.println("Pair with minimum difference: " + array[minIndex] + ", " + array[minIndex + 1]
           + " with difference " + minDifference);
 }
}
