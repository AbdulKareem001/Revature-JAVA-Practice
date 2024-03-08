public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountId, double balance, double interestRate) {
        super(accountId, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        this.balance += interest;
        System.out.println("Interest calculated and added to Account " + accountId);
    }
}
