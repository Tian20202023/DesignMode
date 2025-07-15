package state;

public class NormalState extends AccountState {

    public NormalState(Account account) {
        super(account);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("存款" + amount + "，余额为" + (account.getBalance() + amount) + "，当前状态：Normal");
        account.addBalance(amount);
        checkStateChange();
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = account.getBalance() - amount;
        if (newBalance < -2000) {
            System.out.println("取款失败，余额不足且低于-2000！");
            return;
        }
        account.addBalance(-amount);
        System.out.println("取款" + amount + "，余额为" + account.getBalance() + "，当前状态：Normal");
        checkStateChange();
    }

    @Override
    public void computeInterest() {
        double interest = account.getBalance() * 0.01;
        System.out.println("计算利息：" + interest);
    }

    private void checkStateChange() {
        if (account.getBalance() < 0) {
            if (account.getBalance() <= -2000) {
                changeState(new RestrictedState(account));
            } else {
                changeState(new OverdraftState(account));
            }
        }
    }
}