package eun.java.ch02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
//		Set�� list�� �����ϴ�
//		1. �ߺ��� ������� �ʴ´� ��, �ߺ� �����͸� �����ϸ� �ϳ��� ����ȴ�
//		2. �Է� ������ �������� �� �Ѵ�
		
//		������ �߰�, ����, �б�
//		������, ������, ������ ����
		Set<Integer> ss = new HashSet<>();
		
		ss.add(1); ss.add(2); ss.add(3); ss.add(2); ss.add(2);
		System.out.println("ss�� ����Ǿ� �ִ� ������ " + ss + " �Դϴ�.");
		ss.remove(1);
		System.out.println("ss�� ����Ǿ� �ִ� ������ " + ss + " �Դϴ�.");
		
//		������
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5, 10, 12));
//		Set<Integer> s3 = s1; -> error
		Set<Integer> s3 = new HashSet<>(s1);
		
		System.out.println(s3.retainAll(s2));
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("������ s3 : " + s3);
		
//		������
		s3.clear(); // �ʱ�ȭ
		s3 = new HashSet<>(s1);
		s3.addAll(s2);
		System.out.println("������ s3 : " + s3);
		
//		������
		s3.clear(); // �ʱ�ȭ
		s3 = new HashSet<>(s1);
		s3.removeAll(s2);
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("������ s3 : " + s3);

	}

}
