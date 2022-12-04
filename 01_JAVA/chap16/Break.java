package chap16;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<=100; i++) {
            if(i > 20) {
                break; // 반복문 탈출
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
