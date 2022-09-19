package basic;

public class Operator {
	
	final static int SECOND = 1000;
 
	public static void main(String[] args) {

//		초를 입력 받아 몇 분 몇 초인지 계산하는 프로그램
		int minute = SECOND / 60; // 몫
		int second = SECOND % 60; // 나머지
		
		System.out.println("1000s = " + minute + "분" + second + "초");
		
// 		++, --을 이용한 프로그램(증감연산자)
		int a = 10;
		System.out.println("현재의 a는 " + a + "입니다.");
		a++;
		System.out.println("현재의 a는 " + a + "입니다.");
		System.out.println("현재의 a는 " + ++a + "입니다.");
		System.out.println("현재의 a는 " + a++ + "입니다.");
		System.out.println("현재의 a는 " + a + "입니다.");
		
//		%연산자를 이용한 프로그램
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
		System.out.println(6 % 3);
		
// 		==, >, <, &&, ||, !연산을 이용한 프로그램
		int b = 50;
		int c = 50;
		
		System.out.println("a와 b는 같은가요? " + (a==b));
		System.out.println("a가 b보다 큰가요? " + (a>b));
		System.out.println("a가 b보다 작은가요? " + (a<b));
		System.out.println("a가 b와 같으면서 30보다 큰가요?? " + ((a==b) && (a>b)));
		System.out.println("a가 50이 아닌가요? " + !(a==50));

	}

}
