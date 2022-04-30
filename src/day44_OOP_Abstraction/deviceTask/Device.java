package day44_OOP_Abstraction.deviceTask;

public abstract class Device {
    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    public final static boolean hasBattery,hasPowerButton;

    static{
        hasBattery=true;
        hasPowerButton=true;
    }

    public Device(String brand, String model, double price, String color, String size) {
        if(brand == null|| brand.isEmpty()) {
            throw new Error("Invalid Input for brand");
        }
        this.brand = brand;
        if(model == null||model.isEmpty()) {
            throw new Error("Invalid Input for model");
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if(size.isBlank()||size.isEmpty()){
            throw new Error("Invalid Input for size");
        }
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("Invalid Price:"+price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color == null||color.isEmpty()) {
            throw new Error("Invalid Input for Color");
        }
            this.color = color;
        }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +  //"Device{"
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

