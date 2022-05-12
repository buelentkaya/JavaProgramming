package day45_Abstraction_Interface.shape;

public class Pentagon extends Shape{

    public Pentagon(String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
//Area of pentagon = 1/2 × perimeter of pentagon × apothem