package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
//		�ڹٿ��� �⺻������ �����ϴ� ���̺귯�� �߿� Scanner�� �̿��ϸ� ���� ������� �Է��� ���� �� �ִ�
		Scanner sc = new Scanner(System.in);

//		sc.nextInt()�� ����Ǹ� �ڹٴ� ������� �Է��� ���� ������
//		���� i�� ���� �Ҵ����� �ʰ� �����¿� �ְ� �ȴ�
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();

	}

}
