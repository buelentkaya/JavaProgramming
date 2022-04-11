package day38_InheritanceMethodOverriding.carTask;

public class Toyota extends Car{
    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }


    public void start() {
            System.out.println("Twist the key to ignition "+brand + " " + model );  //overriden method
    }



    public void reliable(){
        System.out.println(brand+" "+ model+ " is reliable.");



    }
}
