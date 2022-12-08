package chap32;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("자동차", 2000);
        Truck t = new Truck("트럭", 3000, 1.5);
        SportCar s = new SportCar("스포츠카", 6200, 340);
    }
}

class Car {
    private String name; // 이름
    private int displacement; // 배기량

    public Car(String name, int displacement) {
        this.displacement = displacement;
        this.name = name;
    }
    
    public void klaxon() {
        System.out.println("띠띠!");
    }
}

class Truck extends Car {
    private double ton;

    public Truck(String name, int displacement, double ton) {
        super(name, displacement); // 부모의 생성자를 호출 => 객체 생성!
        this.ton = ton;
    }
    
    public void load() {
        System.out.println("짐싣기!");
    }

    public void klaxon() {
        System.out.println("빵빵!");
    }
}

class SportCar extends Car {
    private double maxSpeed;

    public SportCar(String name, int displacement, double maxSpeed) {
        super(name, displacement);
        this.maxSpeed = maxSpeed;
    }
    
    public void drive() {
        System.out.println("드라이브하기!");
    }

    public void klaxon() {
        System.out.println("뿌와앙!");
    }
}
