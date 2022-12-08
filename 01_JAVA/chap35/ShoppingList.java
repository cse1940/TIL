package chap35;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
//      상품 객체 생성
        Goods monitor = new Monitor("FHD 와이드 모니터", 450000);
        Goods tv = new TV("5K 벽걸이 TV", 2350000);
        Goods computer = new Computer("노트북 고급형", 1650000);

//      장바구니에 담기
        ArrayList<Goods> cart = new ArrayList<Goods>();
        cart.add(monitor);
        cart.add(tv);
        cart.add(computer);

//      장바구니 내역 출력
        for(Goods g : cart) {
            System.out.println(g.toString());
        }
    }
}

abstract class Goods {
    protected String name; // 이름
    protected int price; // 가격
    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return String.format("%s: %d원", name, price);
    }

}

class Monitor extends Goods {
    public Monitor(String name, int price) {
        super(name, price);
    }
}

class TV extends Goods {
    public TV(String name, int price) {
        super(name, price);
    }
}

class Computer extends Goods {
    public Computer(String name, int price) {
        super(name, price);
    }
}
