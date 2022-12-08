package chap33;

public class Jobs {
    public static void main(String[] args) {
//      Person 객체 생성
        Person park = new Person("승은");
//      개발자로서 변신
        Developer devPark = park;
        devPark.programming("Java");
//      강사로 변신
        Instructor instPark = park;
        instPark.teach("자료구조");
//      마사지사로 변신
        Masseur masPark = park;
        masPark.massage();
    }
}

interface Developer {
    public void programming(String lang);
}

interface Instructor {
    public void teach(String subject);
}

interface Masseur {
    public void massage();
}

class Person implements Developer, Instructor, Masseur {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void programming(String lang) {
        System.out.printf("%s => %s 프로그래밍중!\n", name, lang);
    }

    public void teach(String subject) {
        System.out.printf("%s => %s 수업중!\n", name, subject);
    }

    public void massage() {
        System.out.printf("%s => 마사지중!\n", name);
    }
}
