package eun.java.ch03;

import java.util.Scanner;

public class Conditional06 {

	public static void main(String[] args) {
		
//		������ ���ǹ� �̶�� ���׿����ڷ� ��ü ����
//		������ �Է� �޾Ƽ� ¦��, Ȧ���� ����ϴ� ���α׷��� �ۼ��غ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ���: ");
		
		int number = sc.nextInt();
		
		String result = (number % 2 == 0)? "¦��" : "Ȧ��";
		System.out.println(result);

	}

}
