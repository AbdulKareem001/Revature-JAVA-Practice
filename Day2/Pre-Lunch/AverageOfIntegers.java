import java.util.Scanner;

public class AverageOfIntegers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter an integer: ");
                int num = input.nextInt();
                sum += num;
            }

            double average = (double) sum / 10;
            System.out.println("Average of the 10 integers: " + average);
        }
    }
}
