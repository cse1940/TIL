package com.yudong80.java.ch02;

public class »ê¼ú¿¬»êÀÚ {

	public static void main(String[] args) {
		int added = 100 + 200;
		int subtracted = 500 - 300;
		int multiplied = 10 * 20;
		double divided = 100 / 3;
		
		System.out.println("µ¡¼À °á°ú: 100 + 200 = " + added);
		System.out.println("»¬¼À °á°ú: 500 - 300 = " + subtracted);
		System.out.println("°ö¼À °á°ú: 10 * 20 = " + multiplied);
		System.out.println("³ª´°¼À °á°ú: 100 / 3 = " + divided);
		
		int ¸ò = 100 / 3;
		int ³ª¸ÓÁö = 100 % 3;
		System.out.println("¸ò : 100 / 3 = " + ¸ò);
		System.out.println("³ª¸ÓÁö : 100 % 3 = " + ³ª¸ÓÁö);
		
		++added;
		
		--subtracted;
		System.out.println("Áõ°¡: +added = " + added);
		System.out.println("°¨¼Ò: --subtracted = " + subtracted);

	}

}
