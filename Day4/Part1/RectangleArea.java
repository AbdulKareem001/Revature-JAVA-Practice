import java.util.Scanner;

class RectangleAreaCalculator {
    double length, breadth;

    public RectangleAreaCalculator(double l, double b) {
        length = l;
        breadth = b;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        RectangleAreaCalculator rectangle = new RectangleAreaCalculator(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        scanner.close();
    }
}
