//package org.opentutorials.javatutorials.Inheritance.example3;
//
//class Calculator {
//	int left, right;
//	
//	public void setOprands(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
//	
//	public void sum() {
//		System.out.println(this.left + this.right);
//	}
//	
//	public int avg() {
//		return ((this.left + this.right) / 2);
//	}
//} 
//
//class SubstractionableCalculator extends Calculator {
//	public void sum() {
//		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
//	}
//	
////	하위 클래스의 메소드 avg에서 상위 클래스의 메소드를 호출하기 위해 super 사용
////	덕분에 코드의 중복을 제거할 수 있음
////	-> 부모 클래스의 기능을 변경할 수 있는 방법인 메소드 오버라이딩(overriding)!
//	public int avg() {
//		return super.avg();
//	}
//	
//	public void substract() {
//		System.out.println(this.left - this.right);
//	}
//}
//
//public class CalculatorDemo3 {
//
//	public static void main(String[] args) {
//		
//		SubstractionableCalculator c1 = new SubstractionableCalculator();
//		c1.setOprands(10, 20);
//		c1.sum();
//		System.out.println("실행 결과는" + c1.avg());
//		c1.substract();
//
//	}
//
//}
