package com.yudong80.java.ch05;

class Car {
	private static final int DEFAULT_ACCEL = 10;
	static final String SPEED_UNIT = "km/h";
	static final String DISTANCE_UNIT = "km";
	
	private String carNumber;
	private int speed = 0;
	
//	����Ÿ�. speed��ŭ �̵��Ѵٰ� �����մϴ�
	private int distance = 0;
	
	public Car(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void start() {
		System.out.println("����[" + carNumber + "] �� �õ��� �̴ϴ�.");
		accelerate();
	}
	
	public void accelerate() {
		accelerate(DEFAULT_ACCEL);
	}
	
	public void accelerate(int km) {
		speed += km;
		distance += speed;
		printDistance();
	}
	
	public void decelerateHalf() {
		speed *= 0.5;
		distance += speed;
		printDistance();
	}
	
	public void decelerateAs(int km) {
		speed -= km;
		distance += speed;
		printDistance();
	}
	
	public String getNumber() {
		return carNumber;
	}
	
	public int getDistance() {
		return distance;
	}
	
	private void printDistance() {
		String msg = "����[" + carNumber + "] " + 
				"�ü�: " + speed + SPEED_UNIT +
				" >> �̵��Ÿ�: " + distance + DISTANCE_UNIT;
		System.out.println(msg);
	}
}

public class CarExampleV1 {

	public static void main(String[] args) {
		
		Car car = new Car("GREEN");
		car.start(); // 10
		car.accelerate(); // 20
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();

	}

}
