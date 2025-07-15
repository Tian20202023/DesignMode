package state;

public class Account {
    private AccountState state;
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.state = new NormalState(this);
        System.out.println("开户，初始金额为" + initialBalance);
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void computeInterest() {
        state.computeInterest();
    }

    void changeState(AccountState newState) {
        this.state = newState;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double delta) {
        this.balance += delta;
    }
}