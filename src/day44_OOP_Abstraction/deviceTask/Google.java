package day44_OOP_Abstraction.deviceTask;

public final class Google extends Phone implements downloadable,AndroidApps{
    public Google(String model, double price, String color, String size) {
        super("Google", model, price, color, size);
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
    public void downloadApp() {
        System.out.println(getModel() + " is downloading an application");
    }
}
