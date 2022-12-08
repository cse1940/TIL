package chap32;

// 디폴트 생성자 호출 예시
public class DefaultTest {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    public A() {
        System.out.println("A()의 생성자 호출");
    }
}

class B extends A {
    public B() {
//      super();
        System.out.println("B()의 생성자 호출");
    }
}
