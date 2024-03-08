class BankAccount {
    private static int accountCounter = 1000;
    private String name;
    private String address;
    private String typeOfAccount;
    private double balance;
    private String accountNumber;
    protected int numberOfTransactions; // Change visibility to protected

    public BankAccount(String n, String addr, String type, double bal) {
        name = n;
        address = addr;
        typeOfAccount = type;
        balance = bal;
        accountNumber = "BA" + accountCounter++;
        numberOfTransactions = 0;
    }

    public void displayInfoAndBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name + "\tAddress: " + address + "\tType of Account: " + typeOfAccount);
        System.out.println("Balance: $" + balance + "\tNumber of Transactions: " + numberOfTransactions);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            numberOfTransactions++;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                numberOfTransactions++;
                System.out.println("Withdrawal successful. New balance: $" + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address changed successfully.");
    }
}
