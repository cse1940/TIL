package basic;

public class Node { // Node : �ϳ��� ��ǥ�� ����
	
//	1. �ϳ��� ���� �ǹ��ϴ� Node Ŭ������ ����
	
	private int x; // private : �ܺο��� �Ժη� �ٲ� �� ����
	private int y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; // this : �ڽ��� ������ �ִ� ������ x, y��� �Ӽ��� ���� �ٲپ��� ��
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
