package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {

	public static void main(String[] args) {
		
//		멤버를 담고 있는 배열을 반환하고 있다
//		메소드 getMembers가 리턴한 배열을 members 변수에 담았다
//		이 변수를 이용해서 여러 개의 데이터를 처리할 수 있게 된다
		String[] members = getMembers();
		
	}
	
	public static String[] getMembers() {
		String[] members = {"최진혁", "최승은", "한이람", "최유빈"};
		return members;
	}

}
