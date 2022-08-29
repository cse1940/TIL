package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		// 단항연산자
		// (i++) = (i+=1)
		int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력

	}

}
