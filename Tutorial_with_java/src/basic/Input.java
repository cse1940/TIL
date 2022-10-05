package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

//		1. 특정한 정수를 입력 받아서 그대로 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int i = sc.nextInt();
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close();
		
//		2. 파일에 차례로 입력된 모든 정수에 100을 곱해 출력하는 프로그램
		File file = new File("input.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNextInt()) { // input이 읽어오고 있는 파일에서 정수가 있는지?
				System.out.println(input.nextInt() * 100);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생하였습니다.");
		}
		
//		3. 2단~9단까지 구구단을 출력하는 프로그램
		System.out.println("구구단을 외자!");
		for(int n=2; n<10; n++) {
			for(int m=1; m<10; m++) {
				System.out.println(n + "*" + m + "=" + n*m);
			}
			System.out.println("=============");
		}
		

	}

}
