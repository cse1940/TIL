package basic;

public class Loop {
	
	final static int N = 30;
	final static int M = 15;

	public static void main(String[] args) {

//		1. while문을 이용하여 1~1000까지의 합을 출력하는 프로그램
		int i = 1, sum = 0;
		while(i <= 1000) {
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다.");
		
//		2. for문을 이용하여 삼각형을 출력하는 프로그램
//		for문: 초기화 부분; 조건 부분; 연산 부분
		for(int a = N; a > 0; a--) { // ex) a=30일 때, b=30이므로 30개의 *을 출력 후 줄바꿈
			for(int b = a; b > 0; b--) { // 
				System.out.print("*");
			}
			System.out.println();
		}
		
// 		3. for문을 이용하여 원을 출력하는 프로그램
//		x^2 + y^2 = r^2
		for(int x = -M; x <= M; x++) { // x(-15,15)
			for(int y = -M; y <= M; y++) { // y(-15,15)
				if(x*x + y*y <= M*M) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}

//		4. 무한 루프
		int count = 0;
		for(;;) {
			System.out.println("출력");
			count++;
			if(count == 10) {
				break;
			}
		}
	}

}
