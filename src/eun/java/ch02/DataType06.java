package eun.java.ch02;

public class DataType06 {

	public static void main(String[] args) {
		
//		문자열 formating
//		1. %f : 실수 대입해주는 지정자
//		2. %c : 문자 대입해주는 지정자
//		3. %d : 정수형 대입해주는 지정자
//		4. %s : 문자열 대입해주는 지정자
//		5. %b : boolean 자료형 대입해주는 지정자
		
		double applePrice = 5.25, bananaPrice = 0.50;
		String result = String.format("Today's apple price %.2f, banana %f best fruit is %s",
							applePrice, bananaPrice, "fineApple");
		System.out.println(result);

	}

}
