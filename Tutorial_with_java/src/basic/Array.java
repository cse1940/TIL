package basic;

import java.util.Scanner;

public class Array {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {

//		1. 원하는 개수만큼의 배열 생성 및 최댓값 구하는 프로그램
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요: ");
		int number = scanner.nextInt(); // 5
		
		int[] array = new int[number]; // 5개의 배열 생성
		for(int i=0; i<number; i++) { 
			System.out.print("배열에 입력할 정수를 하나씩 입력하세요(양수): "); // 5개의 배열에 각각 정수 입력
			array[i] = scanner.nextInt();
		}
		int result = -1;
		for(int i=0; i<number; i++) {
			result = max(result, array[i]); // 입력된 정수값을 처음에 -1이랑 비교하여 큰값 return
		}
		System.out.println("입력한 정수 중 가장 큰 값은 " + result + "입니다.");
		
//		2. 100개의 랜덤 정수의 평균을 구하는 프로그램
		int[] array2 = new int[100]; // 100개의 배열 생성
		for(int i=0; i<100; i++) {
			array2[i] = (int)(Math.random() * 100 + 1); // 1 <= x <= 100
		}
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum += array2[i];
		}
		System.out.println("100개의 랜덤 정수의 평균값은 " + sum/100 + "입니다.");

	}

}
