package eun.java.ch03;

public class Conditional09 {
	
//	enum Ű����� ���� Ÿ���� �����ϱ� ���� Ű������
//	���� Ÿ��(Status) �̸��� �����ϰ� ���� ���(low, middle, hight)�� �����ϸ� ��
	enum Status { 
		low, middle, hight
	}

	public static void main(String[] args) {
		
//		����, ���ڿ�, ����, enum ������ ���
		Status a = Status.low;
		
		switch (a) {
		case low:
			System.out.println("low");
			break;
		case middle:
			System.out.println("middle");
			break;
		case hight:
			System.out.println("hight");
			break;
		default:
			System.out.println("other");
			break;
		}

	}

}
