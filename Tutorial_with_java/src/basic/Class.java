package basic;

public class Class {

	public static void main(String[] args) {
		
//		2. Node Ŭ������ �̿��Ͽ� �� �� ������ ������ ���ϴ� ���α׷�
		Node one = new Node(10, 20);
		Node two = new Node(30, 40);
		Node result = one.getCenter(two); // one�� two�� ���߾�
		System.out.println("x: " + result.getX() + ", y: " + result.getY());

	}

}
