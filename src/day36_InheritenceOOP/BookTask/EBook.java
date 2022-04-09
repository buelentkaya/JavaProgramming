package day36_InheritenceOOP.BookTask;

public class EBook extends Book {
    public char size;
    public int pages;

    public void setInfo(char size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("People like reading this"+author);
    }
}
