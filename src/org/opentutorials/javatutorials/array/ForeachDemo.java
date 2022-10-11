package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		
//		for-each
		String[] members = {"최진혁", "최유빈", "한이람", "최승은"};
		for(String member : members) {
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
//		위의 구문은 배열 members의 값을 변수 member에 담아서 중괄호 구간 안으로 전달해준다		

	}

}
