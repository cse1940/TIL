package eun.java.ch04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhileDemo05 {

	public static void main(String[] args) {
		
//		정수형 set 만들어서 값을 1 ~ 10 저장
		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
//		해당 원소에 짝수가 존재하는지 확인 후 true/false 반환
		for(int i : sets) {
			if(i % 2 == 0) {
				System.out.println(i + " true");
			} else {
				System.out.println(i + " false");
			}
		}
		System.out.println("==========");
		
//		retainAll 교집합 함수를 이용해 1 ~ 10 짝수만 뽑아 set 집합을 만들고 출력
		Set<Integer> odd = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8, 10));
		sets.removeAll(odd);
		System.out.println(sets);
		System.out.println("==========");
		
		Set<Integer> odds = new HashSet<Integer>(odd);
		System.out.println(odds);

	}

}
