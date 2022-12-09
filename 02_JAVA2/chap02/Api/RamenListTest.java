package Api;

import java.util.ArrayList;

public class RamenListTest {
    public static void main(String[] args) {
        ArrayList<Ramen> list = new ArrayList<Ramen>();

        Ramen shin = new Ramen("신라면", 1500);
        Ramen jin = new Ramen("진라면", 1200);
        Ramen bibim = new Ramen("비빔면", 1400);

        list.add(shin);
        list.add(jin);
        list.add(bibim);

        for(int i=0; i<list.size(); i++) {
            Ramen ramen = list.get(i);
            System.out.printf("list.get(%d) -> %s\n", i, ramen.toString());
        }

        int sum = 0;
        for(int i=0; i<list.size(); i++) {
            Ramen ramen = list.get(i);
            sum += ramen.getPrice();
        }

        System.out.println("==============");
        System.out.printf("합계: %s", sum);
    }
}

class Ramen {
    private String name;
    private int price;

    public Ramen(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("Ramen { name: %s, price: %d }", name, price);
    }

    public int getPrice() {
        return price;
    }
}
