package day44_OOP_Abstraction.car;

public final class Toyota extends Car{

    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" start with an Ignition key.");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" can drive 190 km per hour.");
    }
}
