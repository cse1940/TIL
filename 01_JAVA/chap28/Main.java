package chap28;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(10000);
        Account b = new Account(3000);
        a.send(4000, b); // a계좌에서 4천원을 b에게 송금!
    }   
}

class Account {
//  필드 => 클래스 내부 전역에서 활동 가능
    private int balance;
//  생성자
//  scope : 변수의 활동 영역!
//  변수 탐색 원리 : 가장 가까운 곳에서 부터 찾음!
    public Account(int balance) { // 파라미터 => 해당 메서드 내부에서 활동 가능
        this.balance = balance;
        System.out.println("계좌생성:\n\t" + this.toString());
    }

//  send
    public void send(int amonut, Account target) {
        System.out.println("송금시작:\n\t" + this.toString());
        this.balance -= amonut;
        target.balance += amonut;
        System.out.println("송금완료:\n\t" + this.toString());
    }

//  toString : 현재 객체의 정보를 문자열로 출력
    public String toString() {
        return String.format("Account [balance=%d]", this.balance);
    }
}
