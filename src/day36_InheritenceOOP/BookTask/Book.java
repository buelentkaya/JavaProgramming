package day36_InheritenceOOP.BookTask;

public class Book {
    public String title, type, author;
    public int price;

    public void setInfo(String title, String type, String author, int price){
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
