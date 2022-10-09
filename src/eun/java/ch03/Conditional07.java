package eun.java.ch03;

import java.util.Scanner;

public class Conditional07 {

	public static void main(String[] args) {
		
//		����ڷκ��� ������, ������ �Է¹޴´�
//		BMI = ������(kg) / (����(m)*����(m))
//		BMI ���� �Ʒ��� ���ٸ� �ش� ������ ����Ѵ�
//		18.5 ���� ��ü��
//		18.5 ~ 23 ����
//		23 ~ 25 ��ü��
//		25 ~ 30 ��
//		30 �̻� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��� �ּ���: ");
		double weight = sc.nextDouble();
		System.out.print("������ �Է��� �ּ���: ");
		double height = sc.nextDouble();
		
		double BMI = weight / (0.01*height*0.01*height);
		
		String result = "";
		if(BMI < 18.5) {
			result = "��ü��";
		} else if(BMI <= 23) {
			result = "����";
		} else if(BMI <= 25) {
			result = "��ü��";
		} else if(BMI <= 30) {
			result = "��";
		} else {
			result = "����";
		}
		
		System.out.printf("BMI ������ %f �̹Ƿ� %s �Դϴ�.\n", BMI, result);
		
//		����ڷκ��� ������ �Է¹޾� �������� �Ǵ��Ѵ�
//		1. ������ 4�� ����̸鼭 100���� ������ �������� ������ ����
//		2. ��, ������ 400���� ������ �������� �ش� ����
		
		System.out.println("������ �Է��� �ּ���: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.printf("%d���� �����Դϴ�!", year);
		} else {
			System.out.printf("%d���� ������ �ƴմϴ�.", year);
		}

	}

}
