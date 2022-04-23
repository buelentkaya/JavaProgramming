package day43_OOP_Abstraction.Car;

public final  class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }
    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has an auto pilot feature");
    }
}
