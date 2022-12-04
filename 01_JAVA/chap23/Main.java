package chap23;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "쥬리오";
        h1.hp = 100;
        h1.punch();

        Hero h2 = new Hero("간달프", 80);
        h2.punch();
    }
}

class Hero {
    String name;
    int hp;

//  디폴트 생성자
//  특징 1) 리턴 타입 명시가 없는 메서드
//  특징 2) 이름이 클래스명과 같다
    Hero() {

    }
//  생성자
    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void punch() {
        System.out.printf("[%s]의 펀치!\n", name);
    }
}
