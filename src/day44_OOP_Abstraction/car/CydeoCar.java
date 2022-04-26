package day44_OOP_Abstraction.car;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{
    public CydeoCar( String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" can auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" drives self without any drives in.");
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" starts with a voice recognised technology");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" drives faster than any cars");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" can fly in the sky");
    }
}
