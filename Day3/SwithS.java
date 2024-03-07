import java.util.Scanner;

public class SwithS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldSubstring = scanner.next();

        System.out.print("Enter the replacement string: ");
        String newSubstring = scanner.next();

        String newSentence = sentence.replace(oldSubstring, newSubstring);

        System.out.println("Updated sentence: " + newSentence);

        scanner.close();
    }
}
