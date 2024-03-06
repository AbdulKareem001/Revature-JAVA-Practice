import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = input.nextInt();

        if (marks < 25) {
            System.out.println("Grade: F");
        } else if (marks >= 25 && marks < 45) {
            System.out.println("Grade: E");
        } else if (marks >= 45 && marks < 50) {
            System.out.println("Grade: D");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: A");
        }
    }
}

