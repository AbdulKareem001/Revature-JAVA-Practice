import java.util.Scanner;

public class AverageAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        long product = 1;

        System.out.println("Enter integers, press 'q' to quit");
        while (input.hasNextInt()) {
            int num = input.nextInt();
            sum += num;
            product *= num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No input provided.");
        }
    }
}
