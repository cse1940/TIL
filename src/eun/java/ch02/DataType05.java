package eun.java.ch02;

public class DataType05 {

	public static void main(String[] args) {
		
//		문자열의 내장함수
//		1. indexOf : 문자열 내에서 특정한 문자열의 index 값을 리턴
//		2. substring : 문자열에서 특정한 구간의 문자열을 추출
//		3. subSequence : substring과는 달리 char 형태로 변환함
//		4. contains : 해당되는 문자열을 포함하고 있는지 true/false 반환
//		5. charAt : 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴
//		6. replace : 해당 문자열로 치환
//		7. replaceAll : replace 기능을 다 사용함과 동시에 추가로 정규식 표현 가능
//		8. toUpperCase : 전부 대문자로 변경
//		9. toLowerCase : 전부 소문자로 변경
//		10. split : 문자열을 인자로 주어진 문자열일 기준으로 쪼개서 배열에 담음
		
		String str = "hello";
		int index = str.indexOf('l');
		System.out.println(index);
		System.out.println(str.substring(0));
		System.out.println(str.substring(index));
		
		str = "text.xlsx";
		index = str.indexOf('.');
		System.out.println("확장자는 " + str.substring(index +1));
		System.out.println(str.subSequence(index, index+1));
		
		str = "Java is very funny language!";
		boolean isContain = str.contains("very1");
		System.out.println(isContain);
		
		System.out.println(str.charAt(6));
		
		String returnStr = str.replace("funny", "good");
		System.out.println(str);
		System.out.println(returnStr);
		
		returnStr = str.replaceAll("funny", "good");
		System.out.println(str);
		System.out.println(returnStr);
		
		returnStr = str.toUpperCase();
		System.out.println(returnStr);
		
		returnStr = str.toLowerCase();
		System.out.println(returnStr);
		
		String[] res = str.split(" "); // 띄어쓰기 기준으로 쪼갬
		for(String s : res) {
			System.out.println(s);

		}

	}
}
