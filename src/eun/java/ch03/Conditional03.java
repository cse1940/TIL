package eun.java.ch03;

public class Conditional03 {

	public static void main(String[] args) {
		
		boolean btrue = true;
		boolean bfalse = false;
		
//		�� ���� &&(and)
		System.out.println(btrue && btrue);
		System.out.println(btrue && bfalse);
		System.out.println(bfalse && btrue);
		System.out.println(bfalse && bfalse);
		
//		�� ���� ||(or)
		System.out.println(btrue || btrue);
		System.out.println(btrue || bfalse);
		System.out.println(bfalse || btrue);
		System.out.println(bfalse || bfalse);

	}

}
