package eun.java.ch05;

public class IncrementDemo {

	public static void main(String[] args) {
		
		int x = 0;
		System.out.println("호출 전 x의 값은 " + x + "입니다.");
		increment(x);
		System.out.println("호출 후 x의 값은 " + x + "입니다.");
		

	}
	
	public static void increment(int n) {
		System.out.println("함수 내부에서 전달받은 n의 값은 " + n + "입니다.");
		n++;
		System.out.println("함수 내부에서 변경한 n의 값은 " + n + "입니다.");
	}

}
