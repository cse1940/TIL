package chap01;

public class Break {
    public static void main(String[] args) {
//      1부터 10까지 총합 출력 및 계산
        printSum(1, 10);
    }

    public static void printSum(int start, int end) {
        int sum = 0;

        for(int i=start; i<end+1; i++) {
            System.out.printf("%d", i);
            sum += i;

            if(i == end) {
                break;
            }
            System.out.printf(" + ");
        }
        System.out.printf("\n=> %d", sum);
    }
}
