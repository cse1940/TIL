package chap01;

public class WhileStatement {
    public static void main(String[] args) {
        countDown(5);
    }

    public static void countDown(int num) {
        System.out.println("카운트 다운을 시작합니다..");

        while(num > 0) {
            System.out.printf("%d..\n", num);
            num--;
        }

        System.out.println("발사!");
    }
}
