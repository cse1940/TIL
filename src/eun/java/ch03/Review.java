package eun.java.ch03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		
//		�迭(collection)
//		1. List
//		2. Map
//		3. Set
	
//		���ǹ�
//		1. if
//		2. switch
		
//		���Ұ� 5���� ������ ������ �迮�� ����� ������ ������ �ʱ�ȭ
		int[] number = {1, 2, 3, 4, 5};
		
		int[] number2 = new int[5];
		number2[0] = 1; number[1] = 2; number[2] = 3; number[3] = 4; number[4] = 5;
		
//		������ index �迭�� ũ�� -1
		System.out.println("������ index�� " + (number.length -1) + "�Դϴ�.");
		
//		������ �����͸� ������ �� �ִ� list�� set�� �����ϰ� �����͸� �� �ΰ� �Է�
//		�й��� �̸��� �ϳ��� ���ҷ� ���� map�� �����ϰ� ������ �����͸� �Է�
		List<Integer> lists = new ArrayList<>();
		lists.add(100); lists.add(200);
		System.out.println(lists);
		
		Set<Integer> sets = new HashSet<>(lists);
		sets.add(100); sets.add(300);
		System.out.println(sets);
		
		Map<Integer, String> maps = new HashMap<>();
		maps.put(2019144044, "�ֽ���"); maps.put(2019144049, "ȫ����");
		System.out.println(maps);
		
		if(number.length > 10) {
			System.out.println("�迭�� ũ��� 10���� Ů�ϴ�.");
		} else if(number.length > 5) {
			System.out.println("�迭�� ũ��� 5���� ũ�� 11���� �۽��ϴ�.");
		} else {
			System.out.println("�迭�� ũ��� 6���� �۽��ϴ�.");
		}
		
		if(number.length > 10 && number2.length > 5) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�ٽ� �õ��� �ּ���.");
		}
		
		if(number.length > 10 || number2.length > 5) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�ٽ� �õ��� �ּ���.");
		}
		
//		case by case
		int value = 0;
		switch(value) {
		case 0:
			System.out.println("ĳ���Ͱ� �������� �� �� �����ϴ�.");
			break;
		case 1:
			System.out.println("ĳ���Ͱ� 1�������� �� �� �ֽ��ϴ�.");
			break;
		default:
			System.out.println("�ٽ� �Է��� �ּ���.");
			break;
		}

	}

}
