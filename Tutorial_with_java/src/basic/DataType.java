package basic;

public class DataType {

	public static void main(String[] args) {

// 		1. double형을 이용해 평균을 구하는 프로그램
		double a = 10.3;
		double b = 9.6;
		double c = 14.2;
		
		System.out.println("(a+b+c) / 3) = " + (a+b+c) / 3);
		
//		2. ascii코드 기반의 char형을 이용해 a~z 출력하는 프로그램
		for(char i='a'; i<='z'; i++) {
			System.out.print(i + " ");
		}
			
//		3. 10진수를 8진수 or 16진수로 바꾸어 보기
		int d = 200;
		System.out.println("\n10진수 : " + d);
		System.out.format("8진수 : %o\n", d);
		System.out.format("16진수 : %x", d);
		
//		4. String의 substring 함수를 활용해 보기
		String name = "Seung Eun";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));

	}

}
