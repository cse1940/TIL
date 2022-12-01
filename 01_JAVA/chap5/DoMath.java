package chap5;

public class DoMath {
    public static void main(String[] args) {
        double score = 1.0 + 2.0 * 3.0;

        System.out.println(score); // 7.0

        score = score / 2.0;

        System.out.println(score); // 3.5

        double copy = score;

        System.out.println(copy); // 3.5
    }
}
