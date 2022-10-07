package eun.java.ch04;

public class Review02 {

	public static void main(String[] args) {

		int[] ary = {10, 20, 30, 40, 50};
		System.out.println(ary[0]);
		
//		배열 요소에 직접 접근하는 변수 i는 배열의 index 번호
//		int i는 배열 index
		for(int i=0; i<ary.length; i++) {
			
		}
		
//		배열 요소를 for문이 알아서 가져와서 변수 i에 값을 전달함 -> index 개념 X
//		int i는 배열 요소의 값
		for(int i : ary) {
			i = 100;
		}

	}

}
