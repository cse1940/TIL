package chap33;

//  Q. 주어진 코드가 컴파일 되지 않았던 이유는?
//     인터페이스의 프로토타입 메서드를 재정의하지 않았기 때문에
public class Main {
    public static void main(String[] args) {
//      객체 생성
        Person personPark = new Person("승은");

//      객체를 학생의 관점으로 바라봄
//      Person 클래스가 Student 인터페이스의 구현체이므로 가능
        Student studentPark = personPark;

//      학생의 본분
        studentPark.study();
        studentPark.drinkBeer();
    }
}

// 학생 역할을 인터페이스로 정의
interface Student {
    public void study();
    public void drinkBeer();
}

// 학생의 역할을 부여받은 Person 클래스
class Person implements Student {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println(name + "이는 공부중!");
    }

    @Override
    public void drinkBeer() {
        System.out.println(name + "이는 음주중!");
    }
}
