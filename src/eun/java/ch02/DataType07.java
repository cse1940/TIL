package eun.java.ch02;

public class DataType07 {

	public static void main(String[] args) {
		
//		문자열 응용함수 
//		1. StringBuffer : 변하는 문자열을 다룰 때 사용
//		2. append : 문자열 붙이기
//		3. toString : String으로 변환
//		4. insert : 해당 index에 문자 삽입
		
		String str = "url:127.0.0.1:8080";
		String user = "admin";
		String pwd = "0000";
		String result = str + " " + user + " " + pwd;
		System.out.println(result);
		
		result = "";
		result += str;
		result += " ";
		result += user;
		result += " ";
		result += pwd;
		System.out.println(result);
		
		StringBuffer sb = new StringBuffer();
		result = sb.append(str) 
				   .append(" ")
				   .append(user)
				   .append(" ")
				   .append(pwd)
				   .toString(); 
		System.out.println(sb.toString());
		sb.insert(1, "111111"); 
		System.out.println(result);

//		String 객체는 크기가 고정되어 있기 때문에 내부의 문자열을 수정할 수 없음
//		그렇기 때문에 문자열을 수정할 때마다 새로운 문자열을 리턴해야 함 -> 불변(immutable)
//		StringBuffer은 객체의 공간이 부족해지는 경우 버퍼의 크기를 유연하게 늘려준다 
//		그래서 문자열을 변경하는 작업이 많을 경우에는 String 대신 사용하는 것이 좋음 -> 가변(mutable)

	}

}
