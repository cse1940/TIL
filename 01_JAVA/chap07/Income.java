package chap07;

public class Income {
    public static void main(String[] args) {
        double mon = 8.62, tues = 10.23, wen = 12.48, thurs = 7.82, fri = 9.54;

        double score = mon + tues + wen + thurs + fri;

        System.out.printf("$ %.2f", score);
    }
}
