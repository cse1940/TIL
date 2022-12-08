package Constructor;

public class StarcraftTest {
    public static void main(String[] args) {
        Starcraft s1 = new Starcraft("모랄레스", 60, 60);
        Starcraft s2 = new Starcraft("레이너", 80, 0);

        s2.stimpack();
        s1.heal(s2);
    }
}

class Starcraft {
    String name;
    int hp, mp;

    Starcraft(String name, int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        this.name = name;
    }

    void stimpack() {
        hp -= 10;
        System.out.printf("[%s]의 스팀팩! HP: %d => %d\n", name, this.hp, hp);
    }

    void heal(Starcraft name) {
        this.mp -= 10;
        name.hp += 10;
        System.out.printf("[%s]의 치유! => [%s] HP(%d => %d)",this.name , name, hp, name.hp);
    }
}
