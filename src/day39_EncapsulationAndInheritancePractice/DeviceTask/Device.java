package day39_EncapsulationAndInheritancePractice.DeviceTask;

public class Device {
    private String brand, model;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            System.err.println("brand cannot be null");
            System.exit(1);
        }
        if (brand.isBlank() || brand.isEmpty()) {
            System.err.println("INvalid INput :" + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            System.err.println("model cannot be null");
            System.exit(1);
        }
        if (model.isBlank() || model.isEmpty()) {
            System.err.println("INvalid INput :" + model);
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid Price Input: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public void turnOn() {
        System.out.println(brand + " " + model + " is turning on");
    }

    public void turnOff() {
        System.out.println(brand + " " + model + " is turning off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
