package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Google extends Phone{
    public Google( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, price, hasBattery, hasPowerButton);
    }
}
