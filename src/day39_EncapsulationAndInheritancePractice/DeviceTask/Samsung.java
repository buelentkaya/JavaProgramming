package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Samsung extends Phone{
    public Samsung( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, hasBattery, hasPowerButton);
    }
    public void freeze() {
        System.out.println(getBrand()+ " " + getModel() + " is freezing ");
    }
}
