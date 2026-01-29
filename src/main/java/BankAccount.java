public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive;
    private String holderName;

    public BankAccount(double initialBalance, double minimumBalance) {
        this.balance = initialBalance;
        this.minimumBalance = minimumBalance;
        this.isActive = true;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            throw new IllegalArgumentException("Withdrawal would breach minimum balance");
        }
        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}
