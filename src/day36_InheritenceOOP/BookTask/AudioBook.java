package day36_InheritenceOOP.BookTask;

public class AudioBook extends Book{
    public double length;
    public String narrator;

    public void listen(){
        System.out.println("People like listening to these Ebook narrated by "+narrator);
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
