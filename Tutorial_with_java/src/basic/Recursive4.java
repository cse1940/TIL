package basic;

public class Recursive4 {
	
	public static int fibonacci(int number) {
		if(number == 1) { // 첫 번째 원소
			return 1;
		} else if(number == 2) { // 두 번째 원소
			return 1;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	public static void main(String[] args) {

//		4. 피보나치 수열을 재귀 함수로 구현할 수 있다.
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + " 입니다.");
	}

}
