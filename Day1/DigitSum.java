import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        
        int firstDigit = number / 100;       
        int secondDigit = (number / 10) % 10; 
        int thirdDigit = number % 10;         

        int sum = firstDigit + secondDigit + thirdDigit;
        
        System.out.println("Output: " + firstDigit + " + " + secondDigit + " + " + thirdDigit + " = " + sum);
        
        scanner.close();
    }
}
