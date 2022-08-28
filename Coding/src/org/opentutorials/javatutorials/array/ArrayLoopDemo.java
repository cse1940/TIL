package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		String[] members = {"최진혁", "최유빈", "한이람"};
		// 반복문을 이용해서 배열 members의 내용을 하나씩 꺼낸 후에 
		// 상담 결과를 화면에 출력하고 있다.
		// 배열이란, 연관된 정보를 하나의 그룹으로 관리하기 위해서 사용하는데
		// 그 정보를 처리할 때는 반복문을 주로 이용한다.
		for(int i=0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
			
		}

	}

}
