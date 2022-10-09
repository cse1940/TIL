package eun.java.ch02;

public class DataType07 {

	public static void main(String[] args) {
		
//		���ڿ� �����Լ� 
//		1. StringBuffer : ���ϴ� ���ڿ��� �ٷ� �� ���
//		2. append : ���ڿ� ���̱�
//		3. toString : String���� ��ȯ
//		4. insert : �ش� index�� ���� ����
		
		String str = "url:127.0.0.1:8080";
		String user = "admin";
		String pwd = "0000";
		String result = str + " " + user + " " + pwd;
		System.out.println(result);
		
		result = "";
		result += str;
		result += " ";
		result += user;
		result += " ";
		result += pwd;
		System.out.println(result);
		
		StringBuffer sb = new StringBuffer();
		result = sb.append(str) 
				   .append(" ")
				   .append(user)
				   .append(" ")
				   .append(pwd)
				   .toString(); 
		System.out.println(sb.toString());
		sb.insert(1, "111111"); 
		System.out.println(result);

//		String ��ü�� ũ�Ⱑ �����Ǿ� �ֱ� ������ ������ ���ڿ��� ������ �� ����
//		�׷��� ������ ���ڿ��� ������ ������ ���ο� ���ڿ��� �����ؾ� �� -> �Һ�(immutable)
//		StringBuffer�� ��ü�� ������ ���������� ��� ������ ũ�⸦ �����ϰ� �÷��ش� 
//		�׷��� ���ڿ��� �����ϴ� �۾��� ���� ��쿡�� String ��� ����ϴ� ���� ���� -> ����(mutable)

	}

}
