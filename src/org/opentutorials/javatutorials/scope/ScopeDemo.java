package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
//	유효범위?
//	메소드나 클래스 안에 포함되어서 이러한 기능들의 부품으로서의 가치를 높여주는 역할을 한다
	static void a() { 
		int i = 0; // 변수 i가 메소드 a에 소속된 변수라는 의미다
				   // 따라서, 이 변수의 값을 어떻게 바꿔도 이 변수의 밖에는 영향을 주지 않는다
	}

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			a(); // 내부 변수의 값이 그 외부에 영향을 미치지 않는다는 것을 알 수 있다
			System.out.println(i);
		}
	}

}
