package eun.java.ch05;

public class MethodDemo04 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = a;
		b = 200;
//		변수 a는 바뀌었을까? 아니요
		
		int[] ary1 = {1, 2, 3, 4, 5};
		int[] ary2 = ary1;
		ary2[0] = 1000;
//		ary1[0]은 바뀌었을까? 네

	}

}
