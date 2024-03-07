import java.util.Scanner;

public class VCDWSCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whitespace = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isWhitespace(c)) {
                whitespace++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespace characters: " + whitespace);

        scanner.close();
    }
}
