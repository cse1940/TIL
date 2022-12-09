package Api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RottoTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

//      45개의 공을 만든다.
        for(int i=1; i<=45; i++) {
            numbers.add(i); 
        }

//      섞는다.
        Collections.shuffle(numbers);

//      뽑는다.
        int[] picked = new int[6];
        for(int i=0; i<6; i++) { // 섞인 numbers의 앞 6개 숫자를 가져옴!
            picked[i] = numbers.get(i);
        }

        System.out.printf("자동 생성 번호: %s\n", Arrays.toString(picked));
    }
}
