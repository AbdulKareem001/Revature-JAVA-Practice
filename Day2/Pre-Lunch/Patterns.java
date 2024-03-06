public class Patterns {
    public static void main(String[] args) {
        // Pattern a
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern b
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2); // Alternating 1 and 0
            }
            System.out.println();
        }
    }
}
