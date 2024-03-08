import java.util.Scanner;

class Employee {
    double salary;

    void getInfo(double sal, int hoursWorked) {
        salary = sal;
        if (salary < 500) {
            addSal();
        }
        addWork(hoursWorked);
    }

    void addSal() {
        salary += 10;
    }

    void addWork(int hoursWorked) {
        if (hoursWorked > 6) {
            salary += 5;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter employee's salary: ");
        double sal = scanner.nextDouble();
        System.out.print("Enter number of hours worked per day: ");
        int hours = scanner.nextInt();

        employee.getInfo(sal, hours);
        System.out.println("Final salary: $" + employee.salary);

        scanner.close();
    }
}
