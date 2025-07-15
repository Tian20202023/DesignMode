package state;


public class Client {
    public static void main(String[] args) {
        Account account = new Account(1000.0);

        account.deposit(1000.0); // 存款
        account.withdraw(3000.0); // 取款
        account.withdraw(2000.0); // 取款
        account.deposit(4000.0); // 存款
    }
}