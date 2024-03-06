import java.util.Scanner;

public class RectangleSquareCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        if (length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is a rectangle.");
        }
    }
}
