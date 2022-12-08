package chap27;

public class Main2 {
    public static void main(String[] args) {
        Account myAccount = new Account(5000);
        User.check(myAccount);
    }
}

class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

//  getter
    public int getBalance() {
        return balance;
    }
}

class User {
    static void check(Account account) {
        System.out.printf("현재 잔액: %d원\n", account.getBalance());
    }
}