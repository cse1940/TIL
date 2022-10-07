package eun.java.ch03;

public class Conditional02 {

	public static void main(String[] args) {
		
		int v = 11;
		
		System.out.println(v >= 5);
		System.out.println(v < 10);
		
		if(v >= 5) {
			if(v < 10) {
				System.out.println("5 <= v < 10"); // 5 6 7 8 9
			} 
			System.out.println("5 <= v"); // 5 이상은 무조건 실행
		}

	}

}
