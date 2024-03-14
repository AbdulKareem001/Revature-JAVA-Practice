public class HourglassStarPattern {
    public static void main(String[] args) {
        int n = 4; // number of rows in the hourglass

        // Upper part of the hourglass
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the hourglass
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
