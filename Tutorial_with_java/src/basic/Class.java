package basic;

public class Class {

	public static void main(String[] args) {
		
//		2. Node 클래스를 이용하여 두 점 사이의 중점을 구하는 프로그램
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two); // one가 two의 정중앙
		System.out.println("x: " + result.getX() + ", y: " + result.getY());

	}

}
