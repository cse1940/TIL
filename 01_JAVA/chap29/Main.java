package chap29;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//      Random 객체 생성
        Random rand = new Random();

//      난수 생성
        int a = rand.nextInt(); // 임의의 정수를 생성
        int b = rand.nextInt(30); // 0~30 사이의 정수를 생성
        double c = rand.nextDouble(); // 임의의 실수를 생성
        boolean d = rand.nextBoolean(); // 임의의 참/거짓을 생성

//      결과 출력
        System.out.printf("nextInt(): %d\n", a);
        System.out.printf("nextInt(30): %d\n", b);
        System.out.printf("nextDouble(): %f\n", c);
        System.out.printf("nextBoolean(30): %s\n", d);
    }
}
