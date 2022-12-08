package chap30;

import java.util.ArrayList;
import java.util.Random;

// Q. 1부터 N사이 임의의 정수를 반환하도록 주사위 클래스를 완성하고,
//    해당 주사위를 1000번 던진 값의 평균을 구하시오.
public class Main {
    public static void main(String[] args) {
//      1. 입력값 받기
        int N = Integer.parseInt("12");

//      2. N면체 주사위 생성
        Die d = new Die(N);

//      3. 1000번 주사위를 던져 결과를 저장
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0; i<1000; i++) {
            int randNum = d.roll();
            numbers.add(randNum);
        }

//      4. 평균값 계산
        double avg = average(numbers);

//      5. 결과 출력
        System.out.println("avg : " + avg);
    }

    public static double average(ArrayList<Integer> list) {
//      평균값을 반환
        int sum = 0;
        for(Integer n : list) {
            sum += n;
        }
        return sum / list.size();
    }
}

class Die {
    private int maxNumber; // 주사위의 최대값

//  생성자 구현
    public Die(int maxNumber) {
        this.maxNumber = maxNumber;
    }

//  메서드 : 1 ~ maxNumber 반환
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(maxNumber) + 1; // [1:maxNumber]
    }
}
