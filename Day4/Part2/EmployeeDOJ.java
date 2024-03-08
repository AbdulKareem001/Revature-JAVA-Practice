import java.util.Scanner;

class Employee {
    String name;
    double salary;
    String dateOfJoining;
    
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
    }
}

public class EmployeeDOJ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            employee.name = input.nextLine();
            System.out.print("Salary: ");
            employee.salary = input.nextDouble();
            input.nextLine(); 
            System.out.print("Date of Joining: ");
            employee.dateOfJoining = input.nextLine();
            
            employees[i] = employee;
        }
        
    
        System.out.println("\nDetails of all employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
            System.out.println(); 
        }
    }
}
