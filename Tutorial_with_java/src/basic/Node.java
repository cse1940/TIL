package basic;

public class Node { // Node : 하나의 좌표를 뜻함
	
//	1. 하나의 점을 의미하는 Node 클래스를 생성
	
	private int x; // private : 외부에서 함부로 바꿀 수 없음
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; // this : 자신이 가지고 있는 고유의 x, y라는 속성의 값을 바꾸어줄 때
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y; 
	}
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}

}
