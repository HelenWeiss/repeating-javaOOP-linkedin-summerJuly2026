public class BankAccount {

    // attributes of the class
    private String owner;
    private double balance;

    // constructor
    public BankAccount(String owner, int startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    // getter method
    public String getOwner() {
        return owner;
    }

    // getter method
    public double getBalance() {
        return balance;
    }

    // behavior (method)
    public double deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
        return 0;
    }

    // behavior (method)
    public double withdraw(double amount) {
        if (amount <= this.balance) {
            balance = this.balance - amount;
        }
        return 0;
    }

}
