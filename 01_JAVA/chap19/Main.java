package chap19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = new int[10];

//      박테리아의 개체수 변화
        for(int i=0; i<values.length; i++) {
            values[i] = (int)Math.pow(2, i);
        }

        System.out.println(Arrays.toString(values));
    }
}
