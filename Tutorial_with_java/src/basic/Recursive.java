package basic;

public class Recursive {
	
	public static int factorial(int number) {
		int sum = 1;
		for(int i=2; i<=number; i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
//		1. 팩토리얼을 반복 함수로 구현할 수 있다.
		System.out.println("10!은 " + factorial(10) + " 입니다.");
	

	}

}
