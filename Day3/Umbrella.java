import java.util.Scanner;

public class Umbrella {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            if (word.contains("e")) {
                System.out.println("The letter 'e' is present in the word 'Umbrella'.");
            } else {
                System.out.println("The letter 'e' is not present in the word 'Umbrella'.");
            }
        }
    }
}
