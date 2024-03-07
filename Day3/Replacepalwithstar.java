import java.util.Scanner;

public class Replacepalwithstar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");

        for (String word : words) {
            if (isPalindrome(word)) {
                for (int i = 0; i < word.length(); i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            } else {
                System.out.print(word + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
