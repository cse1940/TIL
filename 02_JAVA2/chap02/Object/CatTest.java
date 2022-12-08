package Object;

public class CatTest {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();

        c1.name = "네로";
        c2.name = "나비";

        c1.meow();
        c2.meow();
    }
}

class Cat {
    String name, breeds;
    int age;

    void meow() {
        System.out.printf("[%s]의 야옹~\n", name);
    }

    void claw() {
        System.out.printf("[%s]의 할퀴기!\n", name);
    }
}
