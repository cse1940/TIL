package chap01;

public class Random {
    public static void main(String[] args) {
        int x = rollDie();
        int y = rollDie();

        System.out.printf("주사위의 눈: %d\n", x);
        System.out.printf("주사위의 눈: %d", y);
    }

    public static int rollDie() {
        return (int)(Math.random() * 6) + 1; 
    }
}
