package eun.java.ch05;

import java.util.Arrays;

public class MethodDemo02 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = a;
		b = 200;
		System.out.println(a); // a는 값이 안 바뀜
		System.out.println(b);
		
		int[] ary1 = {1, 2, 3, 4, 5};
		int[] ary2 = ary1;
		
		ary2[0] = 1000;
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary2));
	}

}
