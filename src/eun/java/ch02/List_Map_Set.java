package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List_Map_Set {

	public static void main(String[] args) {
		
//		list, map, set�� ���
		
//		list�� set�� ���� ���� �����͸� �����ϴ� �������� ����
//		list : �ִ´�� ����, ���� ������
//		set : �ߺ��� ������� �ʰ� ���� ������ -> ������(retainAll), ������(addAll), ������(removeAll)�� ������ ����
//		list�� set�� ���� ��ҷ� �ؼ� ���� �� ����
		List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3)); 
		System.out.println(li);
		
		Set<Integer> se = new HashSet<>(li);
		System.out.println(se);
		
//		Map�� key : value�� �ϳ��� ������
//		key�� ���, value�� ���
//		key�� �ش��ϴ� �Ӽ��� set�� �Ӽ��� -> �ߺ� �Ұ�
		Map<Integer, String> names = new HashMap<>();
		
//		�� 3���� ���������� contains�� ������ ����

	}

}
