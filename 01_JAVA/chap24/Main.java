package chap24;

public class Main {
    public static void main(String[] args) {
        int money1 = 10000;
        System.out.print(money1 + " -> ");
        zero(money1);
        System.out.println(money1);

        Money money2 = new Money(10000);
        System.out.print(money2.getWon() + " -> ");
        zero(money2);
        System.out.println(money2.getWon());
    }
    public static void zero(int d) {
        d = 0;
    }
    public static void zero(Money m) {
        m.won = 0;
    }
}

class Money {
    int won;
    Money(int w) {
        won = w;
    }
    public int getWon() {
        return won;
    }
}
