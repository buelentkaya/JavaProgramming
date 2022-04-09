package day35_OOP_Encapsulation;

public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0){
            System.err.println("Invalid side: " + side);
        System.exit(1);}
        this.side = side;
    }

    public double calcAre() {
        return side * side;
    }

    public double calcPerimeter() {
        return 4 * side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side +
                "perimeter of square=" + calcPerimeter() +
                "area of square=" + calcAre() +
                '}';
    }
}
