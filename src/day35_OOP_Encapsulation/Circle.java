package day35_OOP_Encapsulation;

public class Circle {
    private  double radius;  // 0 or -
    public  static double pi=3.14;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0||radius==0)
            return;
        this.radius = radius;
    }
}
