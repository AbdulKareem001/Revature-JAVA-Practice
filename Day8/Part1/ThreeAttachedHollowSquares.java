public class ThreeAttachedHollowSquares {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            // First Square
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Common Side
            for (int k = 1; k <= 2; k++) {
                System.out.print(" ");
            }

            // Second Square
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else if (j > size) {
                    System.out.print(" ");
                }
            }

            // Common Side
            for (int k = 1; k <= 2; k++) {
                System.out.print(" ");
            }

            // Third Square
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else if (j < 3) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
