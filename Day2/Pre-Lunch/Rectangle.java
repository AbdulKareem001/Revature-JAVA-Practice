public class Rectangle {
    public static void main(String[] args) {
        double l = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double area = l * b;
        double perimeter = 2 * ( + b);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
   }
}