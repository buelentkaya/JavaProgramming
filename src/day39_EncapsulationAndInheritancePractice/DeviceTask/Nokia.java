package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Nokia extends Phone{
    public Nokia( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, price, hasBattery, hasPowerButton);
    }
    public void selfDefense(){
        System.out.println("You can use "+getBrand()+" "+getModel()+" as a self defence tool");
    }
}
