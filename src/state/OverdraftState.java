package state;

public class OverdraftState extends AccountState {

    public OverdraftState(Account account) {
        super(account);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("存款" + amount + "，余额为" + (account.getBalance() + amount) + "，当前状态：Overdraft");
        account.addBalance(amount);
        checkStateChange();
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = account.getBalance() - amount;
        if (newBalance < -2000) {
            System.out.println("取款失败，余额低于-2000！");
            return;
        }
        account.addBalance(-amount);
        System.out.println("取款" + amount + "，余额为" + account.getBalance() + "，当前状态：Overdraft");
        checkStateChange();
    }

    @Override
    public void computeInterest() {
        double interest = account.getBalance() * 0.02;
        System.out.println("计算利息：" + interest);
    }

    private void checkStateChange() {
        if (account.getBalance() >= 0) {
            changeState(new NormalState(account));
        } else if (account.getBalance() <= -2000) {
            changeState(new RestrictedState(account));
        }
    }
}
