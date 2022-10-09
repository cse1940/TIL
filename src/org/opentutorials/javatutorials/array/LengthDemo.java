package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		
//		배열을 정의하는 다른 방법과 배열에 담겨 있는 값의 수를 알아내는 방법
		String[] classGroup = new String[4];
		
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length); 
		classGroup[1] = "최유빈";
		System.out.println(classGroup.length);
		classGroup[2] = "한이람";
		System.out.println(classGroup.length);
		classGroup[3] = "최승은";
		System.out.println(classGroup.length);
		
//		length는 배열에 실제 담긴 데이터의 숫자를 의미하는 것이 아니라
//		배열을 처음 생성할 때 지정한 배열의 크기를 의미한다는 점

	}

}
