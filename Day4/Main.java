public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1, 5000, 5);
        CurrentAccount current = new CurrentAccount(2, 10000);
        DematAccount demat = new DematAccount(3, 20000);

        savings.deposit(1000);
        savings.calculateInterest();
        System.out.println("Savings Account Balance: " + savings.getBalance());

        current.withdraw(500);
        System.out.println("Current Account Balance: " + current.getBalance());

        demat.deposit(3000);
        System.out.println("Demat Account Balance: " + demat.getBalance());
    }
}
