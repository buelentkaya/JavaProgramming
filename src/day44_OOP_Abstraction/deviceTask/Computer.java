package day44_OOP_Abstraction.deviceTask;

public abstract class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
public abstract void outOfOrder();
    //{System.out.println(getBrand()+" "+getModel()+" is out of order,it does not work any more.");}

}
