package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

//		1. Ư���� ������ �Է� �޾Ƽ� �״�� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int i = sc.nextInt();
		System.out.println("�Էµ� ������ " + i + "�Դϴ�.");
		sc.close();
		
//		2. ���Ͽ� ���ʷ� �Էµ� ��� ������ 100�� ���� ����ϴ� ���α׷�
		File file = new File("input.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextInt()) { // input�� �о���� �ִ� ���Ͽ��� ������ �ִ���?
				System.out.println(input.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� ���߿� ������ �߻��Ͽ����ϴ�.");
		}
		
//		3. 2��~9�ܱ��� �������� ����ϴ� ���α׷�
		System.out.println("�������� ����!");
		for(int n=2; n<10; n++) {
			for(int m=1; m<10; m++) {
				System.out.println(n + "*" + m + "=" + n*m);
			}
			System.out.println("=============");
		}
		

	}

}
