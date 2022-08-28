package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		// for-each : 배열의 내용을 탐색할 때 for문을 좀 더 간편하게 사용하는 방법
		String[] members = {"최진혁", "최유빈", "한이람"};
		for(String e : members) { // 배열 members의 값을 변수 e에 담아서 중괄호 구간 안으로 전달
			System.out.println(e + "이 상담을 받았습니다.");
		}

	}

}
