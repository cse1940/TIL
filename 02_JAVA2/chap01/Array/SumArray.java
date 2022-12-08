package chap01.Array;

public class SumArray {
    public static void main(String[] args) {
        int[] runningMinuter = {42, 66, 57, 54, 88};
        int sum = 0;

        for(int i=0; i<runningMinuter.length; i++) {
            sum += runningMinuter[i];
        }

        double average = sum / runningMinuter.length;

        System.out.printf("달리기 시간 총합: %d분\n", sum);
        System.out.printf("달리기 시간 평균: %.0f분\n", average);
    }
}
