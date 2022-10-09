package eun.java.ch06;

import java.util.ArrayList;
import java.util.List;

class TempTest {
	int value;
	
//	alt + shift + s
	
}

public class Review {

	public static void main(String[] args) {
		
		List<TempTest> lists = new ArrayList<TempTest>();
		TempTest t = new TempTest();
		
		for(int i=0; i<3; i++) {
			t.value = i;
			System.out.println(t.value);
			lists.add(t);
			System.out.print(lists + " ");
		} 
		
		for(TempTest tempTest : lists) {
			System.out.println(tempTest.value);
		}

	}

}
