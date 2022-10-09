package eun.java.ch04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ForDemo01 {

	public static void main(String[] args) {
		
//		for 반복문은 순환할 횟수가 정해져 있거나 알고 있을 때 주로 사용
		int[] ary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
		System.out.println("==========");
		
//		개선된 for 반복문 -> for each
		for(int i : ary) {
			System.out.println(i);
		}
		System.out.println("==========");
		
		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		for(Integer i : sets) {
			System.out.println(i);
		}
		System.out.println("==========");
		
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("001", 10); maps.put("002", 20); maps.put("003", 30);
		for(String i : maps.keySet()) {
			System.out.println(i + " : " + maps.get(i));
		}
		
	}	
}
