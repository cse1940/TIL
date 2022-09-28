package org.opentutorials.javatutorials;

public class DataType {

	public static void main(String[] args) {

//		자바에서는 따옴표가 없는 숫자는 숫자로 인식한다.
		System.out.println(1 + 2);
		System.out.println(1.2 + 1.3);
		System.out.println(2 * 5);
		System.out.println(6 / 2);
		
//		자바는 문자(char)와 문자열(String)을 구분한다.
//		문자는 한 글자를 의미하고, 문자열은 여러 개의 문자가 결합한 것을 의미한다.
//		문자는 작은따옴표로 감싸야 한다.
		System.out.println('생');
		System.out.println("생활코딩");
//		하나의 문자를 큰따옴표로 감싼다고 에러가 발생하지는 않는다.
		System.out.println("최");
		
//		만약 문자열 안에 큰 따옴표를 넣고 싶다면? escape!
		System.out.println("eun said \"Welcome programming world\"");
		
//		여러 줄의 표시
		System.out.println("HTML\nCSS\nJavaScript\n");
		
//		문자의 연산
		System.out.println("최" + "승은");

	}

}
