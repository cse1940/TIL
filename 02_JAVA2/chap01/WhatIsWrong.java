package chap01;

public class WhatIsWrong {
    public static void main(String[] args) {
        int a = square(3);
        double b = cube(2.0);
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public static int square(int n) {
        return n * n;
    }

    public static double cube(double n) {
        return n * n * n;
    }
}
