import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int searchNumber = input.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number " + searchNumber + " is present in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }
    }
}
