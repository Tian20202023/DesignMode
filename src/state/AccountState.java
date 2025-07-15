package state;

public abstract class AccountState {
    protected Account account;

    public AccountState(Account account) {
        this.account = account;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();

    protected void changeState(AccountState newState) {
        account.changeState(newState);
    }
}