package eun.java.ch04;

import java.util.Scanner;

public class BreakDemo01 {

	public static void main(String[] args) {
		
//		1. ����ڷκ��� ������ ���� ��� �Է¹޴´�
//		2. �Է¹��� ������ ��� ���� ������
//		3. �� ���� 100�� ������ ��� �����Ѵ�
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��� �ּ���: ");
			int number = sc.nextInt();
			count += number;
			
			if(count > 100) {
				break;
			}
		}
		System.out.println("count: " + count);

	}

}
