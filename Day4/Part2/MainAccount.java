import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of depositors: ");
            int numberOfDepositors = scanner.nextInt();
            BankAccount[] accounts = new BankAccount[numberOfDepositors];

            for (int i = 0; i < numberOfDepositors; i++) {
                scanner.nextLine(); // consume the newline character
                System.out.print("Enter name for depositor " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter address for depositor " + (i + 1) + ": ");
                String address = scanner.nextLine();
                System.out.print("Enter type of account for depositor " + (i + 1) + ": ");
                String typeOfAccount = scanner.nextLine();
                System.out.print("Enter balance for depositor " + (i + 1) + ": ");
                double balance = scanner.nextDouble();

                accounts[i] = new BankAccount(name, address, typeOfAccount, balance);
            }

            System.out.println("\nOperations on Bank Accounts:");

            for (BankAccount account : accounts) {
                account.displayInfoAndBalance();

                // Perform deposit, withdrawal, and address change operations for each account
                account.deposit(100.00);
                account.withdraw(50.00);
                account.changeAddress("New Address");
                account.displayInfoAndBalance();
            }

            // Display the total number of transactions across all accounts
            int totalTransactions = 0;
            for (BankAccount account : accounts) {
                totalTransactions += account.numberOfTransactions;
            }

            System.out.println("\nTotal Number of Transactions: " + totalTransactions);
        }
    }
}
