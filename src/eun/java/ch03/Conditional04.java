package eun.java.ch03;

import java.util.Scanner;

public class Conditional04 {

	public static void main(String[] args) {

//		������� �Է��� �޴� ��ü�� �ϳ� ������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���: ");
		int number = sc.nextInt();
		
		if(number >= 5 && number < 10) {
			System.out.println("�Է��Ͻ� ���ڴ� 5�̻� 10�̸� �Դϴ�.");
		}
		
		if(number >= 10 || number < 5) {
			System.out.println("�Է��Ͻ� ���ڴ� 10�̻� �Ǵ� 5�̸� �Դϴ�.");
		}

	}

}
