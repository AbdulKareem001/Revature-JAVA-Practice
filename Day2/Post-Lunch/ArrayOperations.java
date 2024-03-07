import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("The elements in the array are: ");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
