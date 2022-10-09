package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Set {

	public static void main(String[] args) {
		
//		list�� set�� ����
//		�� ������ ���� ��ȯ�� ������
		
//		�ߺ��� ����ϴ� ����Ʈ�� �����
		List<Integer> lists = new ArrayList<>(Arrays.asList(5, 4, 8, 7, 9, 1, 5, 4, 7, 1, 2, 4));

//		����ؼ� Ȯ���ϰ�
		System.out.println(lists);
		
//		�ߺ��� ������� �ʴ� set�� ����µ�, �����ʹ� ������ lists�� ������ �ִ� �����ͷ� ��
//		�׷��� �ߺ��� ������ ����� sets�� ������ ��
		Set<Integer> sets = new HashSet<>(lists);
		System.out.println(sets);
		
//		�ߺ��� ������ sets�� ������ ���� lists���ٰ� �ٽ� ���Ӱ� ���� �־���
		lists = new ArrayList<>(sets);
		
//		�ᱹ�� ����Ʈ�� �ߺ��� ������ ����� ���� �� ����
		System.out.println(lists);

	}

}
