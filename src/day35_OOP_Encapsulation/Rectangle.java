package day35_OOP_Encapsulation;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
     setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid Input" + width);
            System.exit(0);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid Input" + length);
            System.exit(0);
        }
        this.length = length;
    }

    public double calcArea(){
        return width * length;
    }

    public double calcPerimeter(){
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}


