package day44_OOP_Abstraction.deviceTask;

public final class Desktop extends Computer{

    public Desktop(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void outOfOrder() {
        System.out.println(getModel()+" "+" does not work");
    }
    public void watchFilm(String NameOfTheFilm){
        System.out.println( NameOfTheFilm+"film can be watched on "+getBrand()+ "  " +getModel()+" with 4K" );
    };
}
