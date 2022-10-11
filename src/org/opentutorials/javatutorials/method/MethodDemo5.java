package org.opentutorials.javatutorials.method;

public class MethodDemo5 {

	public static void main(String[] args) {
		
		numbering(1, 5);
		
	}
	
	public static void numbering(int init, int limit) {
		int i = init;
		while(i < limit) {
			System.out.println(i);
			i++;
		}
		
//	만약 메소드로 여러개의 입력값을 전달하고 싶다면 어떻게 해야 할까?
//	출력할 숫자의 시작 값과 마지막 값을 입력값으로 전달

	}

}
