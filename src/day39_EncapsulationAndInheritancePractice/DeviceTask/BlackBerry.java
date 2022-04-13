package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class BlackBerry extends Phone{
    public BlackBerry( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("BlackBarry", model, price, hasBattery, hasPowerButton);
    }

}
