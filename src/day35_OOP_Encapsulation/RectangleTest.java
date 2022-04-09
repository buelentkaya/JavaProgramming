package day35_OOP_Encapsulation;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,5);
        System.out.println(rectangle);

       rectangle.setLength(10);
       rectangle.setWidth(12);
        System.out.println(rectangle);//120--44


        System.out.println(rectangle.getLength());//10
        System.out.println(rectangle.getWidth());//12


    }
}
