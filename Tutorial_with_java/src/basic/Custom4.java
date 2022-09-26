package basic;

public class Custom4 {
	
//	반환형, 함수명, 매개변수
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static int function(int a, int b, int c) {
		int result = max(a, b);
		result = max(result, c);
		return result;
	}

	public static void main(String[] args) {

//		4. max()를 이용하여 최댓값을 저장하는 프로그램
		System.out.println("(345, 567, 9999) 중에서 가장 큰 값은 " + function(345, 567, 9999) + " 입니다.");

	}

}
