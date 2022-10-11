package org.opentutorials.javatutorials.method;

public class MethodDemo3 {

	public static void main(String[] args) {
		
		numbering();
		numbering();
		numbering();
		numbering();

	}
	
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
//	MethodDemo2와 비교해보면 결과는 같지만 로직은 단 한번만 등장한다
//	이러한 것을 재활용성이라고 한다
	
	}

}
