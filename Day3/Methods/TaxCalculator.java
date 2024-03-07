import java.util.Scanner;

public class TaxCalculator {
    public static void taxCalculator(double grossSalary, double totalSavings) {
        double taxableIncome = grossSalary - Math.min(totalSavings, 100000);
        double tax = 0.0;
        
        if (taxableIncome <= 100000) {
            tax = 0;
        } else if (taxableIncome <= 200000) {
            tax = 0.1 * (taxableIncome - 100000);
        } else if (taxableIncome <= 500000) {
            tax = 0.1 * 100000 + 0.2 * (taxableIncome - 200000);
        } else {
            tax = 0.1 * 100000 + 0.2 * 300000 + 0.3 * (taxableIncome - 500000);
        }

        System.out.println("Tax to be paid: " + tax);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your gross salary: ");
        double grossSalary = scanner.nextDouble();
        
        System.out.println("Enter your total savings: ");
        double totalSavings = scanner.nextDouble();
        
        taxCalculator(grossSalary, totalSavings);
    }
}
