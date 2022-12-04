package chap25;

public class Main2 {
    public static void main(String[] args) {
        Test.m1();
        Test t = new Test();
        t.m2();
        t.m1(); // 좋은 코드는 아님
    }
}

class Test {
//  유틸리티 메서드
    static void m1() {
        System.out.println("유틸리티 메서드 호출!");
    }
//  일반 메서드
    void m2() {
        System.out.println("일반 메서드 호출!");
    }
}
