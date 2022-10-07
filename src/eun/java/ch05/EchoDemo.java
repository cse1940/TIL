package eun.java.ch05;

public class EchoDemo {

	public static void main(String[] args) {
		
			echo("어려워도 포기하지 말자!", 3);
	}
	
	public static void echo(String s, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(s);
		}
	}

}
