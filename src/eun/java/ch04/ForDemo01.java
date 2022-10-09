package eun.java.ch04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ForDemo01 {

	public static void main(String[] args) {
		
//		for �ݺ����� ��ȯ�� Ƚ���� ������ �ְų� �˰� ���� �� �ַ� ���
		int[] ary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
		System.out.println("==========");
		
//		������ for �ݺ��� -> for each
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
