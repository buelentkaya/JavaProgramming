package day44_OOP_Abstraction.deviceTask;

public final class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, String color, String size) {
        super(brand, model, price, color, size);
    }

    @Override
    public void outOfOrder() {
        System.out.println(getModel()+" "+" does not work");
    }
    public void playGame(String gameName){
        System.out.println(getModel()+" is suitable for playing "+gameName);
    }
}
