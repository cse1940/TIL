package org.opentutorials.javatutorials.io;

// ctrl + shift + O : 필요한 라이브러리 자동으로 만들어줌.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {

	public static void main(String[] args) {
		// 여러 형태의 입출력
		 try {
	            File file = new File("out.txt");
	            Scanner sc = new Scanner(file);
	            while(sc.hasNextInt()) {
	                System.out.println(sc.nextInt()*1000); 
	            }
	            sc.close();
	        } catch(FileNotFoundException e){
	            e.printStackTrace();
	        }

	}

}
