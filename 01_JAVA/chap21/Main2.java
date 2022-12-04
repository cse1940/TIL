package chap21;

public class Main2 {
    public static void main(String[] args) {
//      객체 생성
        Hero h1 = new Hero();
//      객체 값 초기화
        h1.name = "주니어";
        h1.hp = 100;
//      객체에게 메서드를 수행
        h1.punch();
    }
}

class Hero {
//  필드 : 정보
    String name;
    int hp;
//  메서드 : 동작
    void punch() {
        System.out.println(name + "의 펀치!");
    }
}
