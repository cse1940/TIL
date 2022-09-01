package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	
    // 메소드의 정의와 호출
	// 정의 : 직접 메소드를 만드는 것
	// 호출 : 만들어진 메소드를 실행하는 것
	public static void numbering() {
		int i=0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) { // numbering 메소드 호출됨
		numbering();
		numbering();
	}

}
