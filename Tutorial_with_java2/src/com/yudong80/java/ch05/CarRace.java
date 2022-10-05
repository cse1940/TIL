package com.yudong80.java.ch05;

public class CarRace {
	
	private static final int CAR_MAX = 3;
	
//	1. ��ü �迭 ����
	private Car[] cars;
	
	public CarRace() {
		registerCare();
	}
	
	private void registerCare() {
//		2. ��ü �迭 ����
		cars = new Car[CAR_MAX];
		for(int i=0; i<cars.length; ++i) {
			String carName = "SKY-" + i;
			cars[i] = new Car(carName);
		}
	}
	
	public void start() {
//		3. ���� ����
		for(Car car : cars) {
			car.start();
		}
	}
	
	public void race() {
//		4. ����
		cars[0].accelerate(70);
		cars[1].accelerate(50);
		cars[2].accelerate();
		cars[0].decelerateAs(20);
		cars[1].decelerateHalf();
	}
	
	public void showResult() {
//		5. ���� ���
		for(Car car : cars) {
			String msg = "����[" + car.getNumber() + "] " +
					"�̵��Ÿ��� " + car.getDistance() + 
					Car.DISTANCE_UNIT + "�Դϴ�.";
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		
		CarRace race = new CarRace();
		race.start();
		race.race();
		race.showResult();

	}

}
