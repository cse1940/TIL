package org.openturtorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// 반복문의 제어 : break
		// 반복작업을 중간에 중단시키고 싶을 떄
		for(int i=0; i < 10; i++) {
			if(i == 5) // 5~ 부터 반복작업 중단
				break;
			System.out.println("Coding Everybody! " +i);
 
	    }
	}
}
