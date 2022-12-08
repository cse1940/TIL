package chap01;

import java.util.Scanner;

public class Lab03Review {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double f = s.nextDouble();
        double c = (f - 32.0) / 1.8;

        System.out.printf("화씨 %s도는 섭씨로 %s도 입니다!", f, c);
    }
}
