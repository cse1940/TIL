package chap16;

public class Continue {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("숫자: ");

        for(int i=1; i<=10; i++) {
            if(i % 3 == 0) {
                continue; // 다음 반복으로 실행을 넘김
            }
            System.out.print(i + " ");
            sum += i;
        }
        System.out.printf("\n총합: %d\n", sum);
    }
}
