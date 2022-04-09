package day31Constructer;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost(){
        double startingPrice=(size=='S')?10:(size=='M')?12:14;
        double totalPrice=startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping);
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $=" + calcCost() +// we add this part later than we created
                                                   // by copy the prestatement then delete it.
                '}';
    }
}
