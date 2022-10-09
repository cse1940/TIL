package eun.java.ch04;

public class WhileDemo03 {

	public static void main(String[] args) {
		
//		1. 정수형 배열을 만들면서 값을 1 ~ 10 갖는 배열
//		2. 각 배열의 값을 조사해서 짝수만 출력 -> 조건문
//		3. while과 조건문을 사용해서 처리
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int i = 0;
		while(i < array.length) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
			i++;
		}

	}

}
