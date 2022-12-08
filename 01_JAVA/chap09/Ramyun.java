package chap09;

public class Ramyun {
    public static void main(String[] args) {
        RamyunProcessing();
    }

    public static void RamyunProcessing() {
        buy();
        boil();
        put();
        eat();
    }

    public static void buy() {
        System.out.println("라면을 산다.");
    }

    public static void boil() {
        System.out.println("물을 끓인다.");
    }

    public static void put() {
        System.out.println("라면을 넣는다.");
    }

    public static void eat() {
        System.out.println("맛있게 먹는다.");
    }
}
