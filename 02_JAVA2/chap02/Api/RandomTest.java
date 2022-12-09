package Api;

public class RandomTest {
    public static void main(String[] args) {
        int a = DieA.roll();
        int b = DieA.roll();

        System.out.printf("A: %d\n", a);
        System.out.printf("A2: %d\n", b);
    }
}

class DieA {
//  1~6 정수를 반환
    public static int roll() {
        double r = (int)(Math.random() * 6) +1;
        return (int)r;
    }
}


