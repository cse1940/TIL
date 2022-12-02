package chap15;

public class Main {
    public static void main(String[] args) {
        int age = 17;
        printAgeGroup(age);
    }

    public static void printAgeGroup(int age) {
        if(age >= 18) {
            System.out.println("성인 입니다.");
        } else if(age >= 13) {
            System.out.println("청소년 입니다.");
        } else if(age >= 6) {
            System.out.println("어린이 입니다.");
        } else {
            System.out.println("유아 입니다.");
        }
    }
}
