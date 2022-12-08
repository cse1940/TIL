package chap01;

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();

        double S = Math.PI * r * r;

        System.out.printf("반지름이 %d인 원의 넓이 => %.3f", r, S);
    }
}
