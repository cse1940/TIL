package org.opentutorials.javatutorials.array;

public class LengthDemo {

	public static void main(String[] args) {
		// �迭�� �����ϴ� �ٸ� �����
		// �迭�� ����ִ� ���� ���� �˾Ƴ��� ����̴�.
		// .length : �迭�� ó�� ������ �� ������ �迭�� ũ�⸦ �ǹ��Ѵ�.
		String[] classGroup = new String[4];
        classGroup[0] = "������";
        System.out.println(classGroup.length);
        classGroup[1] = "�ֽ���";
        System.out.println(classGroup.length);
        classGroup[2] = "�ѽ���";
        System.out.println(classGroup.length);
        classGroup[3] = "������";
        System.out.println(classGroup.length);

	}

}
