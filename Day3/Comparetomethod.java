import java.util.Scanner;
import java.util.Arrays;

public class Comparetomethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = new String[10];

        System.out.println("Enter the names of 10 friends:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Friend " + (i + 1) + ": ");
            friends[i] = scanner.nextLine();
        }

        Arrays.sort(friends);

        System.out.println("Friends in alphabetical order:");

        for (String friend : friends) {
            System.out.println(friend);
        }

        scanner.close();
    }
}
