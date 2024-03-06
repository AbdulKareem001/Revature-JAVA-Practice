import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            originalArray[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

        System.out.println("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
