package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
}
