package eun.java.ch03;

public class Conditional01 {
	
	public static boolean getTrue() {
		return true;
	}

	public static void main(String[] args) {
		
		int v = 100;
		boolean isTrue = !(v % 2 == 0);
		
		System.out.println(getTrue());
		
		if(getTrue()) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

	}

}
