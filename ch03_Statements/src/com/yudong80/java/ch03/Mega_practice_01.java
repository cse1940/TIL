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
			         System.out.println("구구단 종료!");

			  // 2. 1~10까지의 합계/평균 출력
			     int a = 0;
			     float count = 0;
			    
			     for (a = 1; a <= 10; a++) {
			       count += a;
			     }
			     System.out.println("1~10까지의 합계 :" + count);
			     System.out.println("1~10까지의 평균 :" + count / (a-1));

			  // 3. 1~100까지의 5의 배수의 합계/평균 출력
			     int b = 0;
			     float count2 = 0;
			     for (b = 5; b <= 100; b += 5) {
			       count2 += b;
			     }
			     System.out.println("1~100까지의 5의 배수의 합계 :" + count2);
			     System.out.println("1~100까지의 5의 배수의 평균 :" + count2 / (b-5));

			  // 4. 1~100까지의 짝수, 홀수의 합계를 각각
			     int c = 0, d = 0;
			     int count3 = 0, count4 = 0;
			     for (c = 2; c <= 100; c += 2) {
			       count3 += i;
			      
			     }
			     System.out.println("1~100까지의 짝수의 합계 :" + count3);
			     for (d = 1; d <= 100; d += 2) {
			       count4 += j;
			     }
			     System.out.println("1~100까지의 짝수의 합계 :" + count4);

			  // 5. 두 개의 주사위를 굴린다고 가정, 두 눈의 합이 6이 되는 경우의 수 모두 출력
			    int e = 0, f = 0;

			    for (e = 1; e <= 6; e++) {
			      for (f = 1; f <= 6; f++) {
			        if (e + f == 6) {
			          System.out.println("두 눈의 합이 6이 되는 경우의 수 :" + e + "," + f);
			        }
			      }
			    }
			}
			

	}


