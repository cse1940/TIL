package Constructor;

public class HeroTest {
    public static void main(String[] args) {
        Hero ironMan = new Hero("아이언맨", 80);
        Hero thanos = new Hero("타노스", 160);
        Hero thor = new Hero("토르", 150);
        Hero groot = new Hero("그루트", 40);

        System.out.println(ironMan.toStr());
        System.out.println(thanos.toStr());
        System.out.println(thor.toStr());
        System.out.println(groot.toStr());

        ironMan.punch(groot);
    }
}

class Hero {
    String name;
    int hp;

    Hero(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }

    String toStr() {
        return String.format("Hero { name: %s, hp: %d }", name, hp);
    }

    void punch(Hero enemy) { // 클래스 Hero의 객체를 파라미터로 받을 수 있음
        System.out.printf("[%s]의 펀치!", name);
        enemy.hp -= 20;
        System.out.printf("%s의 HP: %d => %d", enemy.name, this.hp, enemy.hp);
        
    }
}
