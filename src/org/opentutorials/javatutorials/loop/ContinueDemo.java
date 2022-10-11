package org.opentutorials.javatutorials.loop;

public class ContinueDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5)
				continue; // 실행은 즉시 중단하면서 반복은 지속해가게 한다
			System.out.println("힘들어도 코딩은 포기하지 말자!" + i);
		}

	}

}
