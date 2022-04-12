package day39_EncapsulationAndInheritancePractice;

public class Square extends Shape{
private double side;

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid Side ="+side);
            System.exit(1);
        }
        this.side = side;
    }




}
