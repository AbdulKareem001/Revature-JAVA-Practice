import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for the first subject: ");
        int subject1Marks = scanner.nextInt();

        System.out.println("Enter the marks for the second subject: ");
        int subject2Marks = scanner.nextInt();

        System.out.println("Enter the marks for the third subject: ");
        int subject3Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double percentage = (totalMarks / 300.0) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
