package chap27;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1000000);
        System.out.println(myAccount);
        Hacker.malciout(myAccount);
        System.out.println(myAccount);
    }
}

class Account {
    private int balance; // 잔액

    Account(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account [balance=" + balance + "]";
    }
}

class Hacker {
// 계좌 잔액을 0원으로 변경
    static void malciout(Account account) {
//        account.balance = 0; => 해커 클래스에서 접근 불가능!
    }
}
