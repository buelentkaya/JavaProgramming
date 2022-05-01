package day45_Abstraction_Interface.shape;

public class Circle extends Shape{
    public double radius;
    public final static double pi;

    static {
        pi=3.14;
    }

    public Circle(String name, double radius) {
        super(name);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid input :"+ radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+  // we can call "super.toString "method instead of wrting all these:"name='" + name + '\'' +", area='" + area() + '\'' +", perimeter='" + perimeter() + '\'';
                "radius=" + radius +
                '}';
    }
}
