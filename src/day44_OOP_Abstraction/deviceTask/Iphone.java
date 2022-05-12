package day44_OOP_Abstraction.deviceTask;

public final class Iphone extends Phone implements downloadable,AppleApps{


    public Iphone(String model, double price, String color, String size) {
        super("IPhone", model, price, color, size);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " is turning off");
    }

    @Override
    public void fingerPrint() {
        System.out.println(getModel() + " has fingerprint function");
    }

    @Override
    public void downloadApp() {
        System.out.println(getModel()+" using "+ AppStoreName +" on "+OS+" OS");
    }
}
