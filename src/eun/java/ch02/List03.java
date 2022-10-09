package eun.java.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		
//		list�� ���� ����
//		array�� ���� �Ұ���
		
		Integer[] ary = {5, 2, 3, 7, 1}; // ������ �迭 �ʱ�ȭ
		System.out.println(ary[0]);
		
		List<Integer> lists = Arrays.asList(ary); // ary �迭�� list�� ��ȯ
		System.out.println(lists);
		
		lists.sort(null); // �⺻�� ��������
		System.out.println(lists); 
		lists.sort(Comparator.reverseOrder()); // ��������
		System.out.println(lists);
		ary = lists.toArray(new Integer[0]); // ����Ʈ�� �迭�� ����
		System.out.println(ary[0]);
		
//		Ư������ �迭�� �ִ��� ����
		System.out.println(lists.contains(5));
		
//		�迭�� ���� �ٷ� �� ����ϰ� �ʹٸ�
		String[] aryStr = {"aaa", "bbb", "ccc"};
		System.out.println(aryStr);
		System.out.println(Arrays.asList(aryStr)); // aryStr �迭�� list�� ��ȯ
		
//		�迭�� �ִ� ������ ��Ҹ� Ư�� ���ڸ� �������� ������ -> String.join
		System.out.println(String.join(",", aryStr));
		
//		����Ʈ�� ��� ������ Ÿ���� ����
//		1. ���� �� ������ Ÿ���� ����
//		2. ������ ����
//		3. contains�� �̿��ؼ� ���� ���������� �ľ�
//		Arrays.asList()�� �̿��ؼ� �⺻ ������ Ÿ�� �迭�� ����Ʈ�� ��ȯ�� ����
//		�������� �迭�� �� �� ���� ����� �޼ҵ� �ϳ��� ����
//		��ǥ������ ����(sort), ��ü ������ ���(����Ʈ ��ü ��ü�� ���)
//		����Ʈ�� �ٽ� �迭�� ���� -> toArray(new ������Ŭ����[0]);
	}

}
