package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		// 배열을 정의하는 다른 방법과
		// 배열에 담겨있는 값의 수를 알아내는 방법이다.
		// .length : 배열을 처음 생성할 때 지정한 배열의 크기를 의미한다.
		String[] classGroup = new String[4];
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최승은";
        System.out.println(classGroup.length);
        classGroup[2] = "한승혁";
        System.out.println(classGroup.length);
        classGroup[3] = "박진형";
        System.out.println(classGroup.length);

	}

}
