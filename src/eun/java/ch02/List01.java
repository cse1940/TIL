package eun.java.ch02;

import java.util.ArrayList;

public class List01 {

	public static void main(String[] args) {
		
//		Array는 배열을 선언할 때 크기를 지정해 줌
//		ArrayList는 Collection 프레임워크의 일부,
//		크기를 지정해주지 않아도 데이터를 삽입할 때 다 크기가 변하는 가변 배열임
//		기본 자료형은 저장이 안되고, 객체 형태만 저장할 수 있음(Integer, 
		
		int[] ary = new int[3];
		ary[0] = 10;
		ary[1] = 20;
		ary[2] = 30;
		
		ArrayList<Integer> array = new ArrayList<>();
//		1. add : 값 추가하기
//		2. get : 값 가져오기
//		3. remove : 값 삭제하기
//		4. size : 저장 되어있는 데이터의 총 크기 가져오기 (length 같은 느낌)
//		5. clear : 모든 데이터 값 삭제하기
//		6. set : 값 수정하기
		
		array.add(10); 
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		array.add(100);
		array.add(200);
		array.add(300);
		array.add(400);
		array.add(500);
		array.add(600);
		
		System.out.println(array.get(0));
		System.out.println(array.get(array.size() -1));
		System.out.println(array.contains(150)); // 해당되는 문자열을 포함하고 있는지 true/false 반환

	}

}
