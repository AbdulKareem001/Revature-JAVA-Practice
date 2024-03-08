import java.util.Scanner;

class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student john = new Student();
        john.name = "John";
        john.roll_no = 2;

        Student sam = new Student();
        sam.name = "Sam";
        sam.roll_no = 1;

        System.out.println("John - Roll No: " + john.roll_no + " Name: " + john.name);
        System.out.println("Sam - Roll No: " + sam.roll_no + " Name: " + sam.name);

        scanner.close();
    }
}
