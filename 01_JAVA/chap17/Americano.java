package chap17;

public class Americano {
    public static void main(String[] args) {
        int[] sales = new int[5];

        sales[0] = 52; // 월
        sales[1] = 50; // 화
        sales[2] = 55; // 수
        sales[3] = 42; // 목
        sales[4] = 38; // 금

//      배열의 합
        int sum = sales[0] + sales[1] + sales[2] + sales[3] + sales[4];

        System.err.printf("총 판매량: %d잔\n", sum);
    }
}
