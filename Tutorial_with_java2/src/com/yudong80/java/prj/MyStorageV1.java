package com.yudong80.java.prj;

import java.util.Scanner;

public class MyStorageV1 {
	
	static void showMenu() {
		System.out.println("MyStorage v2");
		System.out.println("--------------------------");
		System.out.println("1. ���� ���� ����ϱ� "); 
		System.out.println("2. ���� �ֱ�(�԰�)"); 
		System.out.println("3. ���� ����(���)");
		System.out.println("4. ��� ��ȸ");
		System.out.println("5. �����ϱ�");		
		System.out.println("--------------------------");
	}
	
	static int selectMenu(Scanner s) { 
		System.out.print("���ϴ� �޴��� �����ϼ���: ");
		int select = s.nextInt();
		return select;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			//1. �޴��� ǥ���Ѵ� 
			showMenu();
			
			//2. �޴��� ���� 
			int menu = selectMenu(s);
			if (menu == 5) {
				System.out.println("���α׷��� �����մϴ�. ������ ������.");
				break;
			}
			
			switch(menu) {
			case 1: //register
				System.out.println("������ ����մϴ� <�۾���>\n");
				break;
			case 2: //deposit 
				System.out.println("â�� ������ �ֽ��ϴ� <�۾���>\n");
				break;
			case 3: //withdraw
				System.out.println("â���� ������ �����ɴϴ� <�۾���>\n");
				break;
			case 4:
				System.out.println("â���� ������ ��ȸ�մϴ� <�۾���>\n");
				break;
			}
		}
		s.close();

	}

}
