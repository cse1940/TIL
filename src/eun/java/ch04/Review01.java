package eun.java.ch04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Review01 {

	public static void main(String[] args) {
		
//		배열과 반복문을 이용한 간단한 문제
		Random rd = new Random();
		rd.nextInt(10);
		
//		1. 정수형 배열의 요소를 임의의 숫자로 30개 채워주세요(0 ~ 9)
		int[] array = new int[30];
		for(int i=0; i<array.length; i++) {
			array[i] = rd.nextInt(10);
		}
		// toString : 객체가 가지고 있는 정보가 값들을 문자열로 만들어 리턴
		System.out.println(Arrays.toString(array)); 
		
//		2. 배열 중 각 숫자가 몇 번 반복되었는지 count
//		힌트 : 배열의 index 이용한 계산 -> count 하는 새로운 배열 필요
		int[] ary = new int[10]; // 0으로 자동 초기화
		for(int i=0; i<array.length; i++) {
			ary[array[i]]++;
		}
		for(int i=0; i<ary.length; i++) {
			System.out.printf("[%d : %d] ", i, ary[i]);
		}
		System.out.println();
		
//		3. 반대로 한 번도 안나온 숫자는?
//		Map<Integer, Integer> maps = new HashMap<>(Arrays.asList(array));
		
		
//		4. 컴퓨터가 100 이하 자연수 중 랜덤하게 번호를 선택하고 사용자가 맞추는 게임
//		맞출 때 까지 게임 지속, 맞추면 몇 번만에 맞췄는지? -> while(true)
		int number = rd.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.println("숫자를 입력해 주세요: ");
			int number2 = sc.nextInt();
			if(number < number2) {
				System.out.println("더 작은 수를 입력해 주세요.");
			} else if(number > number2) {
				System.out.println("더 큰 수를 입력해 주세요.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
			count++;
		}
		System.out.println("몇 번만에 맞췄나요?" + count);

	}

}
