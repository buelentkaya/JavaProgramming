package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
}
