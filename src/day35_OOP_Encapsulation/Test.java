package day35_OOP_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        square.setSide(5);
        System.out.println(square.getSide());
        System.out.println(square);
    }
}
