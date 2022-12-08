package chap29;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
//      객체 배열
//      Book[] books = new Book[5];
        ArrayList<Book> books = new ArrayList<Book>();
//      int count = 0;

//      객체 생성
//      books[count++] = new Book("나루토", 4000);
        books.add(new Book("나루토", 4000));
//      books[count++] = new Book("원피스", 4500);
        books.add(new Book("원피스", 4500));
//      books[count++] = new Book("슬램덩크", 5000);
        books.add(new Book("슬램덩크", 5000));

//      객체 출력
        for(Book b : books) {
            System.out.println(b.toString());
        }
    }
}

class Book {
//  필드
    private String title;
    private int price;

//  생성자
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

//  toString()
    public String toString() {
        return String.format("%s(%d원)", this.title, this.price);
    }

}
