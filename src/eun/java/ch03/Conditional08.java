package eun.java.ch03;

import java.util.Scanner;

public class Conditional08 {

	public static void main(String[] args) {
		
//		������ �Ǵ��ϴ� ���α׷��� �����ϰ� �ۼ��� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ���: ");
		
		int year = sc.nextInt();
		
		String result = (year % 4 == 0 && year % 100 != 0 || year % 100 == 0)? "���� �Դϴ�." : "������ �ƴմϴ�.";
		System.out.println(result);

	}

}
