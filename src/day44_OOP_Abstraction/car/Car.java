package day44_OOP_Abstraction.car;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make.isBlank()||make.isEmpty()){
            throw new RuntimeException("Invalid make Input: "+make);
        }
        this.make = make;
        if(model.isBlank()||model.isEmpty()){
            throw new RuntimeException("Invalid model Input: "+model);
        }
        this.model = model;
        if(year<=1886){
            throw new RuntimeException("Invalid Year Input :"+year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("Invalid Price Input:"+price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color.isBlank()||color.isEmpty()){
            throw new RuntimeException("Invalid color Input: "+color);
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println(getMake()+getModel()+"stops!");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +//"Car{"
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
