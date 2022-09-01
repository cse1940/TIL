package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	// return 
	public static String numbering(int init, int limit) {
		int i=init;
		// 만들어지는 숫자들을 output이라는 변수에 담기 위해
		// 변수에 빈 값을 주었음.
		String output="";
		while(i < limit) {
			// 숫자를 화면에 출력하는 대신 변수 output에 담았음.
			output +=i;
			i++;
		}
	
	// output에 담겨있는 문자열을 메소드 외부로 반환하려면
	// 아래와 같이 return을 배치하면 됨.
	return output;
	}

	public static void main(String[] args) {
		// 메소드 numbering이 return한 값이 변수 result에 담긴다.
	    String result=numbering(1, 5);
	    // 변수 result의 값을 화면에 출력함.
	    System.out.println(result);

	}

}
