package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		// 반복문의 제거 1. break
		// 반복작업을 중간에 중단시키고 싶다면?
		for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("Coding Everybody " + i);
        }

	}

}
