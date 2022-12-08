package chap31;

public class Main {
    public static void main(String[] args) {
//      객체 생성
        Novice chobo = new Novice("초보", 100);
        Wizard wizard = new Wizard("해리포터", 100, 100);
//      객체 정보 출력
        System.out.println(chobo.toString());
        System.out.println(wizard.toString());
    }
}

class Novice {
//  필드
    protected String name; // protected : 상속관계시 공개(자식들은 공개)
    protected int hp;
//  생성자
    public Novice(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }
//  toString
    public String toString() {
        return String.format("[Novice] %s(HP: %d)", this.name, this.hp);
    }
}

class Wizard extends Novice { // 자식 클래스
//  필드
    protected int mp;
//  생성자
    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
//  toString() 메서드를 오버라이딩
    public String toString() {
        return String.format("[Wizard] %s(HP: %d, MP: %d)", this.name, this.hp, this.mp);
    }
}
