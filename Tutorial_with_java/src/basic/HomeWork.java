package basic;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

//		1. �ڽ��� �̸��� ����ϴ� ���α׷�
		Scanner name = new Scanner(System.in);
		System.out.println("����� �̸��� �����Դϱ�? ");
		String i = name.next();
		System.out.println(i);
		
//		2. ��Ģ���� ���� ���? 
		System.out.println(10 + 10); // 20
		System.out.println(30 + 30); // 60
		System.out.println(20 - 5); // 15
		System.out.println(40 / 3); // 19
		System.out.println(395 % 10); // 5
		
		
//		3. �簢�� ����� ����ϴ� ���α׷�
		for(int n=0; n<10; n++) {
			for(int m=0; m<10; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
