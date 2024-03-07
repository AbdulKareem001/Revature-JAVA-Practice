import java.util.Scanner;

public class Abbrevations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        StringBuilder abbreviatedName = new StringBuilder();

        for (int i = 0; i < names.length - 1; i++) {
            abbreviatedName.append(names[i].charAt(0)).append(".");
        }
        abbreviatedName.append(names[names.length - 1]);

        System.out.println("Abbreviated name: " + abbreviatedName);

        scanner.close();
    }
}


