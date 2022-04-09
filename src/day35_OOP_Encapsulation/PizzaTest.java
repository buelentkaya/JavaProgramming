package day35_OOP_Encapsulation;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza=new Pizza("small",2,3);
        System.out.println(pizza);


        pizza.setSize("Large");
        pizza.setNumberOfPepperoniTopping(5);
        pizza.setNumberOfCheeseTopping(5);
        System.out.println(pizza);
    }
}
