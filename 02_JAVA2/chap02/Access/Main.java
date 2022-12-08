package Access;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1000000);
        System.out.println(myAccount.toString());

        Hacker.malcious(myAccount);

        System.out.println(myAccount.toString());
    }

}

class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("Account { balance: %d }", balance);
    }
}

class Hacker {
    public static void malcious(Account account) {
        account.balance = 0;
    }
}
