package com.yudong80.java.ch03;

public class Mega_practice_01 {

	public static void main(String[] args) {
			 // 1.
			   int i = 0, j = 0;

			     for (i = 2; i < 10; i++) {
			       for (j = 1; j < 10; j++) {
			         if (j > i) {
			           continue;
			         }
			         System.out.println(i + "*" + j + "=" + i*j);
			       }
			       System.out.println("=======");
			     }
			         System.out.println("������ ����!");

			  // 2. 1~10������ �հ�/��� ���
			     int a = 0;
			     float count = 0;
			    
			     for (a = 1; a <= 10; a++) {
			       count += a;
			     }
			     System.out.println("1~10������ �հ� :" + count);
			     System.out.println("1~10������ ��� :" + count / (a-1));

			  // 3. 1~100������ 5�� ����� �հ�/��� ���
			     int b = 0;
			     float count2 = 0;
			     for (b = 5; b <= 100; b += 5) {
			       count2 += b;
			     }
			     System.out.println("1~100������ 5�� ����� �հ� :" + count2);
			     System.out.println("1~100������ 5�� ����� ��� :" + count2 / (b-5));

			  // 4. 1~100������ ¦��, Ȧ���� �հ踦 ����
			     int c = 0, d = 0;
			     int count3 = 0, count4 = 0;
			     for (c = 2; c <= 100; c += 2) {
			       count3 += i;
			      
			     }
			     System.out.println("1~100������ ¦���� �հ� :" + count3);
			     for (d = 1; d <= 100; d += 2) {
			       count4 += j;
			     }
			     System.out.println("1~100������ ¦���� �հ� :" + count4);

			  // 5. �� ���� �ֻ����� �����ٰ� ����, �� ���� ���� 6�� �Ǵ� ����� �� ��� ���
			    int e = 0, f = 0;

			    for (e = 1; e <= 6; e++) {
			      for (f = 1; f <= 6; f++) {
			        if (e + f == 6) {
			          System.out.println("�� ���� ���� 6�� �Ǵ� ����� �� :" + e + "," + f);
			        }
			      }
			    }
			}
			

	}


