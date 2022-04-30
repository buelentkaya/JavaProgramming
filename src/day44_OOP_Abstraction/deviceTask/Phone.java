package day44_OOP_Abstraction.deviceTask;

public abstract class Phone extends Device{


    public Phone(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    public void call(long phoneNumber){
        System.out.println(getBrand()+ "  "+ getModel()+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand()+ "  "+ getModel()+" is sending text to "+phoneNumber);
    }


    @Override
    public abstract void turnOn() ;

    @Override
    public abstract void turnOff() ;


}
