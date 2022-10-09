package eun.java.ch04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhileDemo05 {

	public static void main(String[] args) {
		
//		������ set ���� ���� 1 ~ 10 ����
		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
//		�ش� ���ҿ� ¦���� �����ϴ��� Ȯ�� �� true/false ��ȯ
		for(int i : sets) {
			if(i % 2 == 0) {
				System.out.println(i + " true");
			} else {
				System.out.println(i + " false");
			}
		}
		System.out.println("==========");
		
//		retainAll ������ �Լ��� �̿��� 1 ~ 10 ¦���� �̾� set ������ ����� ���
		Set<Integer> odd = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8, 10));
		sets.removeAll(odd);
		System.out.println(sets);
		System.out.println("==========");
		
		Set<Integer> odds = new HashSet<Integer>(odd);
		System.out.println(odds);

	}

}
