package chap07;

public class Wallet {
    public static void main(String[] args) {
        int won1 = 3; // 만원권
        int won2 = 4; // 오천원권
        int won3 = 7; // 천원권

        int total = 10000*won1 + 5000*won2 + 1000*won3;

        System.out.println(total + "원");
    }
}
