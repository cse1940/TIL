package eun.java.ch04;

import java.util.Scanner;

public class BreakDemo01 {

	public static void main(String[] args) {
		
//		1. 사용자로부터 정수형 값을 계속 입력받는다
//		2. 입력받은 값들을 계속 더해 나간다
//		3. 그 합이 100을 넘으면 즉시 종료한다
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력해 주세요: ");
			int number = sc.nextInt();
			count += number;
			
			if(count > 100) {
				break;
			}
		}
		System.out.println("count: " + count);

	}

}
