package org.openturtorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		// 반복문의 제어 : continue
		for(int i=0; i < 10; i++) {
			if(i == 5) // i의 값이 5일 때, 다음 구문으로 넘어감
				continue;
			System.out.println("Coding Everybody! " +i);
		}

	}

}
