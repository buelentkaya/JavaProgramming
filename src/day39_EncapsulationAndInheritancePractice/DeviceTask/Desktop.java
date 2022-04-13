package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
}
