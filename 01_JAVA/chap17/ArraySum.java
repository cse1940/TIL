package chap17;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
//      배열 생성
        int[] arr = new int[10];
//      반복문을 통한 초기화
        for(int i=0; i<arr.length; i++) {
            arr[i] = i * i; // 0, 1, 4 ...
        }
        System.out.printf("배열: %s\n", Arrays.toString(arr));
        System.out.printf("총합: %d\n", sum(arr));
    }

    public static int sum(int[] numbers) {
        int sum = 0;

        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i]; 
        }
        return sum;
    }
}
