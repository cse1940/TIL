package chap16;

public class CountDown {
    public static void main(String[] args) {
//      입력
        int count = Integer.parseInt("7");

//      출력
        System.out.println("카운트 다운을 시작합니다!");

//      반복문
        while(count >= 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("발사!");
    }
}
