import java.util.Scanner;

public class PerfectNumber {
    public static boolean perfect(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perfect numbers between 1 and 1000:");
        
        for (int i = 2; i <= 1000; i++) {
            if (perfect(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
