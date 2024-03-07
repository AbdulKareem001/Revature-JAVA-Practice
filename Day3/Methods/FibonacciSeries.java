import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term of Fibonacci series to find: ");
        int n = scanner.nextInt();
        
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of Fibonacci series is: " + result);
    }
}
