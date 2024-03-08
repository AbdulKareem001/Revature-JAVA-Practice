import java.util.Scanner;

class BankAccount {
    private static int accountCounter = 1000;
    private int accountNumber;
    String name;
    String address;
    String type;
    double balance;
    private int numTransactions;
    public int numberOfTransactions;

    public BankAccount(String name2, String address2, String typeOfAccount, double balance2) {
        //TODO Auto-generated constructor stub
    }

    public void generateAccountNumber() {
        this.accountNumber = accountCounter++;
        System.out.println("Unique account number for " + name + " is BA" + accountNumber);
    }

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Type of Account: " + type);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        numTransactions++;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            numTransactions++;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address changed successfully.");
    }

    public int getNumTransactions() {
        return numTransactions;
    }

    public void displayInfoAndBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfoAndBalance'");
    }
}

public class BankTransactions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of depositors: ");
        int numDepositors = input.nextInt();
        BankAccount[] accounts = new BankAccount[numDepositors];

        for (int i = 0; i < numDepositors; i++) {
            BankAccount account = new BankAccount();
            System.out.println("\nEnter details for depositor " + (i + 1) + ": ");
            System.out.print("Name: ");
            account.name = input.next();
            System.out.print("Address: ");
            account.address = input.next();
            System.out.print("Type of Account: ");
            account.type = input.next();
            System.out.print("Balance: ");
            account.balance = input.nextDouble();

            account.generateAccountNumber();
            accounts[i] = account;
        }

        // Print the information of any depositor
        System.out.print("\nEnter the depositor number to view information: ");
        int depositorNumber = input.nextInt();
        accounts[depositorNumber - 1].displayInformation();

        // Add some amount to the account of any depositor
        System.out.print("\nEnter the depositor number to add amount: ");
        depositorNumber = input.nextInt();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = input.nextDouble();
        accounts[depositorNumber - 1].deposit(depositAmount);
        accounts[depositorNumber - 1].displayInformation();

        // Remove some amount from the account of any depositor
        System.out.print("\nEnter the depositor number to withdraw amount: ");
        depositorNumber = input.nextInt();
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        accounts[depositorNumber - 1].withdraw(withdrawAmount);
        accounts[depositorNumber - 1].displayInformation();

        // Change the address of any depositor
        System.out.print("\nEnter the depositor number to change address: ");
        depositorNumber = input.nextInt();
        System.out.print("Enter the new address: ");
        String newAddress = input.next();
        accounts[depositorNumber - 1].changeAddress(newAddress);
        accounts[depositorNumber - 1].displayInformation();

        // Randomly repeat these processes for some other bank accounts
        // Assuming these repeat operations are automated or performed based on certain conditions
        // ...

        // Print the total number of transactions
        int totalTransactions = 0;
        for (BankAccount account : accounts) {
            totalTransactions += account.getNumTransactions();
        }
        System.out.println("\nTotal number of transactions: " + totalTransactions);
    }
}
