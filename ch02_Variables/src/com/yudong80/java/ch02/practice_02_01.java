//다음은 학생 성적의 평균을 출력하는 코드입니다.
package com.yudong80.java.ch02;

public class practice_02_01 {

	public static void main(String[] args) {
		int[] grades = {80, 95, 92, 70};
		double average = (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length;
		
		System.out.println("4과목 평균 점수: " + average);

	}

}
