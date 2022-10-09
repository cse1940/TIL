package eun.java.ch04;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		
//		라이브러리를 사용하지 않고 주어진 데이터의 집합에서 최댓값과 최솟값을 찾아보기
		Random rd = new Random();
		System.out.println(rd.nextInt(100)); // 0 ~ 100 임의의 숫자를 랜덤하게 추출
		
//		1. 난수 10개를 생성해서 정수형 배열에 담고 배열명은 randomAry10
		int[] randomAry10 = new int[10];
		for(int i=0; i<randomAry10.length; i++) {
			randomAry10[i] = rd.nextInt(100);
		}

//		랜덤으로 입력된 값 출력
		System.out.print("현재 배열의 요소들: ");
		for(int i : randomAry10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		2. 배열 중 짝수만 출력
		System.out.print("짝수: ");
		for(int i : randomAry10) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			} i++;
		}
		System.out.println();
		
//		3. 각 배열의 값을 순서대로 더하는데 그 합이 100을 넘기는 순간 index 출력
		int count = 0;
		for(int i=0; i<randomAry10.length; i++) {
			count += randomAry10[i];
			if(count > 300) {
				System.out.println("현재까지의 합은 " + count + ", index는 " + i);
				break;
			}
		}
		
//		4. 배열의 최댓값과 최솟값
		int min = randomAry10[0], max = randomAry10[0];
		for(int i : randomAry10) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("배열의 최댓값은 " + max +", 최솟값은 " + min + "입니다.");
	}

}
