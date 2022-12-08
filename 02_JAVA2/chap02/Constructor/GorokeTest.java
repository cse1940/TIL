package Constructor;

public class GorokeTest {
    public static void main(String[] args) {
        Goroke g1 = new Goroke("피자", 1000);
        Goroke g2 = new Goroke("야채", 800);
        Goroke g3 = new Goroke("팥", 500);

        System.out.println(g1.str());
        System.out.println(g2.str());
        System.out.println(g3.str());
    }
    

}

class Goroke {
    String name;
    int price;

    Goroke(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String str() {
        return String.format("Goroke { name: %s, price: %d원 }", name, price);
    }
}
