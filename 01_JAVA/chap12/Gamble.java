package chap12;

public class Gamble {
    public static void main(String[] args) {
//      획득 달러 계산
        double dollar = dice() + dice() + dice();
//      달러를 환전
        double won = exchange(dollar);
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
    }

    public static int dice() {
//      Math.random() : double 값을 반환 => 0.00 <= x < 1.00
        return (int)(Math.random() * 5) + 1;
    }

    public static double exchange(double dollar) {
        return dollar * 1082.25108;
    }
}
