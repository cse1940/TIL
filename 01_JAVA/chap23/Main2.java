package chap23;

public class Main2 {
    public static void main(String[] args) {
        Hero a = new Hero("아서스", 30);
        Hero d = new Hero("디아블로", 30);

        a.punch(d);
        d.punch(a);
        d.punch(a);
        a.punch(d);
        a.punch(d);
    }
}

class Hero {
    String name;
    int hp;

//  생성자
    Hero(String _name, int _hp) {
        name = _name;
        hp = _hp;
    }

    void punch(Hero enemy) {
        enemy.hp -= 10;
        System.out.printf("[%s]의 펀치!\n", name);
        System.out.printf("\t%s HP: %d\n", enemy.name, enemy.hp);
    }
}
