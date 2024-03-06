import java.util.Scanner;

/**
 * A program to determine if a rectangle is a square based on the user's input for length and breadth.
 */
public class RectangleSquareCheck {

    /**
     * Main method to execute the rectangle type checking.
     * Requests user input for length and breadth of a rectangle and determines if it is a square or a rectangle.
     *
     * @author Kareem
     * @since 2024-03-06
     */
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
