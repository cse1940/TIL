package eun.java.ch03;

import java.util.Scanner;

public class Conditional05 {

	public static void main(String[] args) {
		
//		����ڷκ��� 0 ~ 100 ������ ���� �Է� �޴´�(����)
//		Scanner ��ü
//		int jumsu�� �����Ѵ�
//		90 �̻��̸� A
//		80 ~ 90 B
//		70 ~ 80 C
//		60 ~ 70 D
//		60 �̸� F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��� �ּ���: ");
		int jumsu = sc.nextInt();
		
		if(jumsu >= 90) {
			System.out.println("����� ������ A�Դϴ�.");
		} else if(jumsu >= 80) {
			System.out.println("����� ������ B�Դϴ�.");
		} else if(jumsu >= 70) {
			System.out.println("����� ������ C�Դϴ�.");
		} else if(jumsu >= 60) {
			System.out.println("����� ������ D�Դϴ�.");
		} else {
			System.out.println("����� ������ F�Դϴ�.");
		}

	}

}
