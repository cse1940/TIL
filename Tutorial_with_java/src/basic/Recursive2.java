package basic;

public class Recursive2 {
	
	public static int factorial(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial(number - 1);
			// 5! = 5 * 4 * 3! ...
	}

	public static void main(String[] args) {
		
//		2. 팩토리얼을 재귀 함수로 구현할 수 있다.
		System.out.println("10!은 " + factorial(10) + " 입니다.");

	}

}
