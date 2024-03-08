import java.util.Scanner;

class Student {
    int rollNumber;
    int[] marks = new int[3];
    
    public double calculateAverageMarks() {
        double totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        return totalMarks / marks.length;
    }
}

public class Studentmarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[8];
        
        // Input marks for 8 students in three subjects
        for (int i = 0; i < 8; i++) {
            Student student = new Student();
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            student.rollNumber = input.nextInt();
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                student.marks[j] = input.nextInt();
            }
            
            students[i] = student;
        }
        
        // Calculate and display average marks for each student
        System.out.println("\nRoll Number\tAverage Marks");
        for (Student student : students) {
            double averageMarks = student.calculateAverageMarks();
            System.out.println(student.rollNumber + "\t\t" + averageMarks);
        }
    }
}
