import java.util.Scanner;

class Triangle {
    double side1, side2, side3;

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle: ");
        double s1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double s2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double s3 = scanner.nextDouble();

        Triangle triangle = new Triangle(s1, s2, s3);
        System.out.println("Area of the triangle: " + triangle.getArea());
        System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());

        scanner.close();
    }
}
