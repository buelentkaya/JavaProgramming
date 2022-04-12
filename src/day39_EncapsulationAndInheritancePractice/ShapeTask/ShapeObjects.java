package day39_EncapsulationAndInheritancePractice.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);
        System.out.println(square.perimeter());
        square.setSide(20);
        System.out.println(square.area());

        System.out.println(square.getName());


        Circle circle=new Circle(9.7);
        System.out.println(circle);
        System.out.println("The name of the Circle is "+circle.getName());
        System.out.println("the radius of the circle is "+circle.getRadius());
        System.out.println("The area of the circle is "+circle.area());
        System.out.println("The perimeter of the circle is "+circle.perimeter());


        System.out.println("......................................");



    }
}