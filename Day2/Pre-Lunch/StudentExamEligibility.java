import java.util.Scanner;

public class StudentExamEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Classes held: ");
        int totalClasses = input.nextInt();

        System.out.print("Classes attended: ");
        int attendedClasses = input.nextInt();

        System.out.print("Any medical cause? (Y/N): ");
        String medicalCause = input.next();

        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        if (attendancePercentage >= 75 || medicalCause.equalsIgnoreCase("Y")) {
            System.out.println("Attendance: " + String.format("%.2f", attendancePercentage) + "%");
            System.out.println("You are allowed to take the exam.");
        } else {
            System.out.println("Attendance: " + String.format("%.2f", attendancePercentage) + "%");
            System.out.println("You are not allowed to take the exam.");
        }
    }
}
