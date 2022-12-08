package chap01.Array;

public class Coffee {
    public static void main(String[] args) {
        int[] coffee = {33, 44, 55, 30, 60};
        int sum = 0;

        for(int i=0; i<coffee.length; i++) {
            sum += coffee[i];
        }
        System.out.printf("총 판매량: %d잔", sum);
    }
}
