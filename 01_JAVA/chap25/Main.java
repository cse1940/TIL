package chap25;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("Tom"); // {count: 1, name: Tom}
        System.out.println(a.count);

        Student b = new Student("John"); // {count: 1, name: John}
        System.out.println(b.count);

        Student c = new Student("Kate"); // {count: 1, name: Kate}
        System.out.println(c.count);
    }
}

class Student {
//  클래스 변수 : 객체 외부의 공유가능한 변수
    static int count = 0;
//  인스턴스 변수 : 객체 내부의 변수
    String name;

    Student(String name) {
        count++;
        this.name = name;
    }
}
