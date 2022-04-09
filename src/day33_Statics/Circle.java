package day33_Statics;

public class Circle {

    public double radius, diameter;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
       diameter = radius*2;
    }

    public double calcArea() {
        return pi * radius * radius;
    }

    public double calcPerimeter() {
        return pi * diameter;
    }

    public void printPi() {
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


    public static void main(String[] args) {

        Circle circle1 = new Circle(3.9);
        Circle circle2 = new Circle(4);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(circle1.pi);
        System.out.println(circle2.pi);



    }

}
