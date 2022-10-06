package eun.java.ch02;

import java.util.ArrayList;

public class List01 {

	public static void main(String[] args) {
		
//		Array�� �迭�� ������ �� ũ�⸦ ������ ��
//		ArrayList�� Collection �����ӿ�ũ�� �Ϻ�,
//		ũ�⸦ ���������� �ʾƵ� �����͸� ������ �� �� ũ�Ⱑ ���ϴ� ���� �迭��
//		�⺻ �ڷ����� ������ �ȵǰ�, ��ü ���¸� ������ �� ����(Integer, 
		
		int[] ary = new int[3];
		ary[0] = 10;
		ary[1] = 20;
		ary[2] = 30;
		
		ArrayList<Integer> array = new ArrayList<>();
//		1. add : �� �߰��ϱ�
//		2. get : �� ��������
//		3. remove : �� �����ϱ�
//		4. size : ���� �Ǿ��ִ� �������� �� ũ�� �������� (length ���� ����)
//		5. clear : ��� ������ �� �����ϱ�
//		6. set : �� �����ϱ�
		
		array.add(10); 
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		array.add(100);
		array.add(200);
		array.add(300);
		array.add(400);
		array.add(500);
		array.add(600);
		
		System.out.println(array.get(0));
		System.out.println(array.get(array.size() -1));
		System.out.println(array.contains(150)); // �ش�Ǵ� ���ڿ��� �����ϰ� �ִ��� true/false ��ȯ

	}

}
