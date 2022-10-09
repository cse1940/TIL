package org.opentutorials.javatutorials.method;

public class MethodDemo1 {

	public static void main(String[] args) {
		
//		메소드 numbering의 로직이 실행됨
		numbering(); 

	}

//	메소드의 정의(직접 메소드를 만드는 것)와 호출(만들어진 메소드를 실행하는 것)
//	메소드를 만들 때 public static이라고 적어야 한다고 일단은 기계적으로 이해하자
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}

}
