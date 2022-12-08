package chap09;

public class Random {
    public static void main(String[] args) {
        rollDie();
    }

    public static void rollDie() {
        int r = (int)(Math.random() * 6) + 1;
        System.out.println("주사위의 눈: " + r);
    }
}
