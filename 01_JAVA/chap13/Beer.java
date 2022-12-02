package chap13;

public class Beer {
    public static void main(String[] args) {
//      입력값을 받아와 변환
        int age = Integer.parseInt("15");
        order(age);
    }

    public static void order(int age) {
        if(age >= 18) {
            System.out.println("주문이 완료 되었습니다!");
        } else {
            System.out.println("성인인증이 필요합니다.");
        }
    }
}
