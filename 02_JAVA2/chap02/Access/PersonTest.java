package Access;

public class PersonTest {
    public static void main(String[] args) {
        Person choi = new Person("최승은", "010-1234-5678");

//      getter를 호출하여 필드값을 얻기
        System.out.printf("이 름: %s\n", choi.getName());
        System.err.printf("연락처: %s\n", choi.getPhoneNumber());
    }
}

class Person {
    private String name;
    private String phoneNumber;

    public Person(String n, String p) {
        this.name = n;
        this.phoneNumber = p;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
