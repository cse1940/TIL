package chap01.Array;

public class DailyUser {
    public static void main(String[] args) {
        int[] users = {581, 512, 527, 495, 423, 141, 236};

        double dailyUser = average(users);

        System.out.printf("하루 평균 사용자: %.2f명", dailyUser);
    }

    public static double average(int[] arr) {
        double sum = 0.0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        double avg = sum / arr.length;

        return avg;
    }
}
