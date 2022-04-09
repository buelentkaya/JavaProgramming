package day31Constructer;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        //100 pizza objects: sizeS, chese 2peppetop -3
        //100 pizza objects- m chese topping 3, peppetop -3peppetop -4
        //100 pizza objects- l chese topping 4, peppetop -3peppetop -5

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(smallPizza, mediumPizza, largePizza));

        }

        System.out.println("Total NUmber of Pizza: " + pizzas.size());
        double totalPrice = 0;


        for (Pizza eachPizza : pizzas) {
            totalPrice += eachPizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);

        //Total NUmber of Pizza: 300
        //totalPrice = 5700.0


    }
}
