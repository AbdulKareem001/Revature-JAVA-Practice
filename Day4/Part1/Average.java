import java.util.Scanner;

class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + avg);

        scanner.close();
    }
}
