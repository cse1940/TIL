package eun.java.ch02;

public class DataType05 {

	public static void main(String[] args) {
		
//		���ڿ��� �����Լ�
//		1. indexOf : ���ڿ� ������ Ư���� ���ڿ��� index ���� ����
//		2. substring : ���ڿ����� Ư���� ������ ���ڿ��� ����
//		3. subSequence : substring���� �޸� char ���·� ��ȯ��
//		4. contains : �ش�Ǵ� ���ڿ��� �����ϰ� �ִ��� true/false ��ȯ
//		5. charAt : ���ڿ����� ���ڷ� �־��� ���� �ش��ϴ� ���ڸ� ����
//		6. replace : �ش� ���ڿ��� ġȯ
//		7. replaceAll : replace ����� �� ����԰� ���ÿ� �߰��� ���Խ� ǥ�� ����
//		8. toUpperCase : ���� �빮�ڷ� ����
//		9. toLowerCase : ���� �ҹ��ڷ� ����
//		10. split : ���ڿ��� ���ڷ� �־��� ���ڿ��� �������� �ɰ��� �迭�� ����
		
		String str = "hello";
		int index = str.indexOf('l');
		System.out.println(index);
		System.out.println(str.substring(0));
		System.out.println(str.substring(index));
		
		str = "text.xlsx";
		index = str.indexOf('.');
		System.out.println("Ȯ���ڴ� " + str.substring(index +1));
		System.out.println(str.subSequence(index, index+1));
		
		str = "Java is very funny language!";
		boolean isContain = str.contains("very1");
		System.out.println(isContain);
		
		System.out.println(str.charAt(6));
		
		String returnStr = str.replace("funny", "good");
		System.out.println(str);
		System.out.println(returnStr);
		
		returnStr = str.replaceAll("funny", "good");
		System.out.println(str);
		System.out.println(returnStr);
		
		returnStr = str.toUpperCase();
		System.out.println(returnStr);
		
		returnStr = str.toLowerCase();
		System.out.println(returnStr);
		
		String[] res = str.split(" "); // ���� �������� �ɰ�
		for(String s : res) {
			System.out.println(s);

		}

	}
}
