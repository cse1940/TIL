package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*; // 무시

public class MethodDemo7 {

	public static void main(String[] args) {
		
		String result = numbering(1, 5);
		System.out.println(result);
		try { // 무시
			// 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
		} // 무시
		
	}
	
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while(i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	
//	코드에서 무시라고 표시된 부분은 지금 단계에서는 이해하기 어려운 것
//	중요한 것은 numbering이라는 메소드로부터 화면에 출력이라는 구체적인 행위를 
//	제거하고 대신에 처리 결과를 반환하고 있다는 사실이다

}
