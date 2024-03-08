public class BankAccount {
    protected int accountId;
    protected double balance;

    public BankAccount(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully to Account " + accountId);
        } else {
            System.out.println("Invalid amount for deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully from Account " + accountId);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid amount for withdrawal");
        }
    }

    public double getBalance() {
        return balance;
    }
}
