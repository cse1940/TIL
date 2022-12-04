package chap21;

public class Main {
    public static void main(String[] args) {
//      객체 생성
        Burger b1 = new Burger();
    }
}

class Burger {
//  필드 : 정보
    String name;
    int price;
//  메서드 : 동작
    void showInfo() {
        System.out.println(name + ": " + price + "원");
    }
}
