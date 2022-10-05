package myjava.ch02;

public class DataType03 {

	public static void main(String[] args) {
		
		int num = 0, num2 = 0;
		String str = "hello"; // 변수
		String str1 = "hello"; // 변수
		
		String str2 = new String("hello"); // 객체
		String str3 = new String("hello"); // 객체
		
		System.out.println("str = " + str);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("==============");
		System.out.println(str1.equals(str));
		
//		object는 메모리 주소값을 가지고 있다. 그래서 간접참조를 하게 된다.
//		변수는 직접 값을 가지고 있다.
		
		System.out.println(str1 == str2); // str1과 str3는 각각 생성 되었으므로 주소가 다르다.
		System.out.println(str1.equals(str2)); // .equals()는 내용을 비교하기 때문에 hello 내용이 같으므로 true 반환
		
//		문자열을 생성하는 방법
//		1. 리터럴 방식 String str = "hello";
//			- 동일한 문자열은 실제로 한 번만 생성된다.
//			-- 그리고 생성된 주소를 변수(객체)에 대입한다.
//			-- 그래서 변수(객체)끼리 == 비교해도 된다.
//		
//		2. 객체생성방식 String str = new String("hello");
//			- 독립적인 문자열을 생성한다.
//			- 그리고 생성된 주소를 변수(객체)에 대입한다.
//			- 그래서 변수(객체)의 값은 다르다. == 비교하면 안 된다.
//			- 따라서 비교할 때 객체가 가리키는 실제 값을 비교
//			-- 변수(객체).equals(변수(객체))

	}

}
