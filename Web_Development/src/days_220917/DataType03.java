package days_220917;

public class DataType03 {

	public static void main(String[] args) {
// 		문자열 String
//		"안녕하세요", "hello"
		int num = 0, num2 = 0;
		String str = "hello"; 
		String str1 = "hello"; // 리터럴
		String str2 = new String("hello");
		String str3 = new String("hello"); // 객체생성
		System.out.println("str = " + str);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("---------------");
		System.out.println(str1.equals(str));
		
//		객체(Object)는 메모리 주소값을 가지고 있다. 그래서 간접참조를 하게 된다.
//		변수는 직접 값을 가지고 있다.
		str2 = str3;
		str2 = "good";
		System.out.println(str2 == str3);
		
//		문자열을 생성하는 방법
//		1. 리터럴방식 String str = "hello"
//			- 동일한 문자열은 실제로 한번만 생성된다.
//			- 그리고 생성된 주소를 변수(객체)에 대입한다.
//			- 그래서 변수(객체)끼리 == 비교해도 된다.
//		2. 객체생성방식 String str = new String("hello")
//			- 독립적인 문자열을 생성한다.
//			- 그리고 생성된 주소를 변수(객체)에 대입한다.
//			- 그래서 변수(객체)의 값은 다르다. == 비교하면 안된다.
//			- 따라서, 비교할 때는 객체가 가르키는 실제 값을 비교
//			- 변수(객체).equals(변수(객체))
	}

}
