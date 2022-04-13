package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Computer  extends Device{
    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

}
