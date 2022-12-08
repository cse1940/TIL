package Object;

public class Animals {
    public static void main(String[] args) {
//      Dog, Cat 객체 생성
        Dog d = new Dog();
        Cat c = new Cat();

//      Dog 객체 필드 값 출력
        System.out.printf("이름: %s\n", d.name);
        System.out.printf("품종: %s\n", d.breeds);
        System.out.printf("나이: %d\n", d.age);
        d.bark();

//      필드 값 변경
        c.name = "네로";
        c.breeds = "페르시안";
        c.weight = 3.1;

        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("나이: %f\n", c.weight);
        c.claw();
    }
}

class Cat {
//  필드(상태)
    String name;   // 이름
    String breeds; // 품종
    double weight; // 무게

//  메서드(동작)
    void claw() {
        System.out.println("고양이가 할퀴었습니다.");
    }

    void meow() {
        System.out.println("고양이가 야옹하고 울고 있습니다.");
    }
}

class Dog {
    String name;
    String breeds;
    int age;

    void wag() {
        System.out.println("강아지가 꼬리를 흔듭니다.");
    }

    void bark() {
        System.out.println("강아지가 짖습니다.");
    }
}