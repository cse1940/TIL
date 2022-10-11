package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5) 
				break; // 반복작업을 중단에 즉시 중단
			System.out.println("힘들어도 코딩은 포기하지 말자! " + i);
		}

	}

}
