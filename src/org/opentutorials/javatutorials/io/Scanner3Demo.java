package org.opentutorials.javatutorials.io;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class Scanner3Demo {

	public static void main(String[] args) {
		
//		아래 예제는 out.txt라는 파일을 입력 받아서 화면에 출력하는 예제이다
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 1000);
			}
			sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
