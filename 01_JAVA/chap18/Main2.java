package chap18;

public class Main2 {
public static void main(String[] args) {
//  요일별 방문자 수를 배열로
    int[] users = {257, 281, 234, 232, 187, 99, 116};
    System.out.printf("하루평균 접속자: %d명\n", average(users));
    }

    public static int average(int[] arr) { // int[] arr = users;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
