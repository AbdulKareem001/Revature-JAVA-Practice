import java.util.Scanner;

public class NumberOperations {
    public static void printMax(int a, int b, int c) {
        System.out.println("Maximum number: " + Math.max(a, Math.max(b, c)));
    }

    public static void printMin(int a, int b, int c) {
        System.out.println("Minimum number: " + Math.min(a, Math.min(b, c)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        printMax(num1, num2, num3);
        printMin(num1, num2, num3);
    }
}
