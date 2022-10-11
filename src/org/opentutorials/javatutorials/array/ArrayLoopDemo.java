package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		
//		반복문과 배열의 조화
//		1. 1반 학생들을 번호순으로 정렬해서 줄을 세운다
//		2. 상담받은 학생의 숫자를 기록한다
//		3. 대기중인 학생과 상담을 한다
//		4. 상담받은 학생의 수를 1 증가시킨다
//		5. 총원보다 상담받은 학생의 수가 적다면 3번 절차로 돌아간다
//		   총원과 상담받은 학생의 수가 같다면 상담을 종료하고 업무를 계속한다
		
		String[] members = {"최진혁", "최유빈", "한이람", "최승은"};
		
		for(int i=0; i<members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
		
//		배열이란 연관된 정보를 하나의 그룹으로 관리하기 위해서 사용하는데
//		그 정보를 처리할 때는 반복문을 주로 이용한다
//		반복문과 배열은 매우 밀접한 관계에 있다고 할 수 있다
		

	}

}
