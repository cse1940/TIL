package Api;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Book onepiece = new Book("원피스", 4500);
        Book naruto = new Book("나루토", 5500);
        Book java = new Book("자바 프로그래밍", 6500);

        books.add(onepiece);
        books.add(naruto);
        books.add(java);

        for(int i=0; i<books.size(); i++) {
            System.out.printf("list.get(%d) => %s\n", i, books.get(i));
        }
        
    }
}

class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.price = price;
        this.title = title;
    }

    public String toString() {
        return String.format("Book { name: %s, price: %d }", title, price);
    }
}
