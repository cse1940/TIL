package chap07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.printf("곱하기: %d x %d = %d\n", a, b, a*b);
        System.out.printf("나누기: %d / %d = %d", a, b, a/b);
    }
}
