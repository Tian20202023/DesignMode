package state;

public class RestrictedState extends AccountState {

    public RestrictedState(Account account) {
        super(account);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("存款" + amount + "，余额为" + (account.getBalance() + amount) + "，当前状态：Restricted");
        account.addBalance(amount);
        checkStateChange();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("受限状态下无法取款！");
    }

    @Override
    public void computeInterest() {
        double interest = account.getBalance() * 0.03;
        System.out.println("计算利息：" + interest);
    }

    private void checkStateChange() {
        if (account.getBalance() >= 0) {
            changeState(new NormalState(account));
        } else if (account.getBalance() > -2000) {
            changeState(new OverdraftState(account));
        }
    }
}
