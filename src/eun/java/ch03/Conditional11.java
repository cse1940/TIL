package eun.java.ch03;

import java.util.Scanner;

public class Conditional11 {

	public static void main(String[] args) {
		
//		if switch �������� �����Ӱ� ����ڷκ��� �г�� ������ �Է¹޾Ƽ�
//		4�г��� 70�� �̻��̸� �հ�
//		5�г��� 80�� �̻��̸� �հ�
//		6�г��� 90�� �̻��̸� �հ�
//		�׸��� ���� ������ ��� �Է��̸� �߸� �Է��߽��ϴ�.�� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�г��� �Է��� �ּ���: ");
		int grade = sc.nextInt();
		System.out.print("������ �Է��� �ּ���: ");
		int jumsu = sc.nextInt();
		
		switch (grade) {
		case 4:
			if(jumsu >= 70) {
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
			break;
		case 5:
			if(jumsu >= 80) {
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
			break;
		case 6:
			if(jumsu >= 90) {
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			} else {
				System.out.println("���հ��Դϴ�.");
			}
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			break;
		}

	}

}
