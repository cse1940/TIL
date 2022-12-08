package Constructor;

public class DrinkTest {
    public static void main(String[] args) {
        Drink d1 = new Drink();
        d1.name = "포카리";
        d1.price = 1500;

        Drink d2 = new Drink("박카스", 1000);

        System.out.println(d1.toStr());
        System.out.println(d2.toStr());
    }
}

class Drink {
    String name;
    int price;

//  디폴트 생성자
    Drink() {

    }

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String toStr() {
        return String.format("Drink { name: %s, price: %d }", name, price);
    }
}
