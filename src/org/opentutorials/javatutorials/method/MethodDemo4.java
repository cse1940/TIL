package org.opentutorials.javatutorials.method;

public class MethodDemo4 {

	public static void main(String[] args) {
		
		numbering(5);
		
	}
	
	public static void numbering(int limit) {
		int i = 0;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
		
//	메소드의 입력 값은 매개변수(파라미터)를 통해서 이루어진다
//	만약 필요에 따라서 0부터 4까지 출력하고 싶다면 어떻게 해야 할까?
//	입력 값에 따라서 다른 출력 값을 갖도록 메소드를 정의하면 된다
		
	}
	

}
