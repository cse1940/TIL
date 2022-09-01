package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// 사용자의 입력을 받기 : Scanner
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(i * 1000);
		sc.close();

	}

}
