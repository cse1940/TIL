package chap22;

public class Main {
    public static void main(String[] args) {
        HoBang h1 = new HoBang();
        HoBang h2 = new HoBang();
        HoBang h3 = new HoBang();

        h1.contents = "팥";
        h1.price = 600;
        h2.contents = "야채";
        h2.price = 700;
        h3.contents = "피자";
        h3.price = 800;

        System.out.println(h1.info());
        System.out.println(h2.info());
        System.out.println(h3.info());
    }
}

class HoBang {
    String contents;
    int price;
    String info() {
        return String.format("%s 호빵: %d원", contents, price);
    }
}
