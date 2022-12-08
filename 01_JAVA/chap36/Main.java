package chap36;

public class Main {
    public static void main(String[] args) {
//      두 영웅 생성
        Knight uther = new HolyKnight("우서", 200, 10);
        Knight arthas = new MagicKnight("아서스", 150, 8);

//      우서 : 기사 버프
        uther.increaseHp();
        uther.increaseArmor();
//      우서 : 성기사 버스
        HolyKnight holyUther = (HolyKnight) uther;
        holyUther.healingAura();
        holyUther.holyArmor();

//      아서스 : 기사 버프
        arthas.increaseHp();
        arthas.increaseArmor();
//      아서스 : 마검사 버프
        MagicKnight magicArthas = (MagicKnight) arthas;
        magicArthas.fireArmor();
        magicArthas.thunderBlade();
    }
}

interface Tanker {
    public void increaseHp(); // 쳬력 +100
    public void increaseArmor(); // 아머 +5
}

interface Healer {
    public void healingAura(); // 초당 체력회복 +10
    public void holyArmor(); // 데미지 감소 -10
}

interface Sorcerer {
    public void fireArmor(); // 주변적 초당 데미지 +10
    public void thunderBlade(); // 공격시 추가 데미지 +10
}

class Knight implements Tanker {
    protected String name;
    protected int hp;
    protected int armor;

    public Knight(String name, int hp, int armor) {
        this.armor = armor;
        this.hp = hp;
        this.name = name;
    }

    public void increaseArmor() {
        System.out.printf("[%s] increaseArmor() 시전!\n", name);
        System.out.printf("\t아머가 +5 증가합니다.\n");
        armor += 5;
    }

    public void increaseHp() {
        System.out.printf("[%s] increaseHp() 시전!\n", name);
        System.out.printf("\t체력이 +100 증가합니다.\n");
        hp += 100;
    }
}

// 1. 인터페이스의 메서드 오버라이딩
class HolyKnight extends Knight implements Healer {
    public HolyKnight(String name, int hp, int armor) {
        super(name, hp, armor);
    }
    @Override
    public void healingAura() {
        System.out.printf("[%s] healingAura() 시전!\n", name);
        System.out.printf("\t초당 체력회복이 +10 증가합니다.\n");
    }
    public void holyArmor() {
        System.out.printf("[%s] holyArmor() 시전!\n", name);
        System.out.printf("\t피격시 데미지를 -10 덜 받습니다.\n");
    }
}

class MagicKnight extends Knight implements Sorcerer {
    public MagicKnight(String name, int hp, int armor) {
        super(name, hp, armor);
    }
    @Override
    public void fireArmor() {
        System.out.printf("[%s] fireArmor() 시전!\n", name);
        System.out.printf("\t주변 적 초당 데미지 +10\n");
    } 
    public void thunderBlade() {
        System.out.printf("[%s] thunderBlade() 시전!\n", name);
        System.out.printf("\t공격시 추가 데미지 +10\n");
    }
}
