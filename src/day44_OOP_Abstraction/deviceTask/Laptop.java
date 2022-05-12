package day44_OOP_Abstraction.deviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void outOfOrder() {
        System.out.println(getBrand()+ " " +getModel()+" is out of order");
    }
}
