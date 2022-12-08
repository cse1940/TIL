package Object;

public class StarcraftTest {
    public static void main(String[] args) {
        Marine ma = new Marine("레이너", 80);
        Medic me = new Medic("레이너", 60, 60);

        ma.stimpack();
        me.heal(ma);
    }
}

class Medic {
    String name;
    int hp, mp;

    Medic(String s, int i1, int i2) {
        this.name = s;
        this.hp = i1;
        this.mp = i2;
    }

    void heal(Marine target) {
        System.out.printf("[%s]의 치유! => ", name);
        System.out.printf("[%s] HP(%d => ", target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d)\n", target.hp);
    }
}
}
