package chap27;

public class Main3 {
    public static void main(String[] args) {
        Account myAccount = new Account(5000);
        User.deposit(myAccount, 7000);
        User.check(myAccount);
    }
}

class Account {
    private int balance;
    public Account(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

//  setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class User {
    public static void check(Account account) {
        System.out.printf("현재 잔액: %d\n", account.getBalance());
    }
    public static void deposit(Account account, int amount) {
        int bal = account.getBalance();
        account.setBalance(bal + amount);
    }
}
