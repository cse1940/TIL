package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		sc.hasNextInt()�� �Է°��� ����� ������ ������ ������Ű�� ������ �Ѵ�
//		���� �Է��� ���� int ���� �ƴ� ���� false�� �����ϰ�.
//		int�� ǥ���� �� �ִ� ������ �������� ���� true�� �����Ѵ�
//		���� ���� �ڵ�� ����ڰ� �Է��� �� ������ ������ ��ٷȴٰ� �Է��� �Ͼ��
//		�ݺ����� �����ϸ鼭 �Է°��� 1000�踦 ���� ���� ��µȴ�
		while(sc.hasNextInt()) { 
			System.out.println(sc.nextInt() * 1000);
		}
		sc.close();

	}

}
