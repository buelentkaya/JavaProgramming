package day35_OOP_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size == null) {
            System.err.println("Size can not be null");
            System.exit(0);
        }
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large"))) {
            System.err.println("Invalid Input");
            System.exit(0);
        }

        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping <= 0) {
            System.err.println("Invalid Input");
            System.exit(0);
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping <= 3){
            this.numberOfCheeseTopping = numberOfCheeseTopping;}
        else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping <= 4){
            this.numberOfCheeseTopping = numberOfCheeseTopping;}
        else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping <= 5){
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else{
            System.err.println("Invalid Input");
            System.exit(0);
        }

    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfPepperoniTopping <= 4){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
        else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping <= 5){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if(size.equalsIgnoreCase("large") && numberOfPepperoniTopping <= 6){
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else{
            System.out.println("Invalid number of pepperoni topping: "+numberOfPepperoniTopping);
            System.exit(1);
        }

    }

    public double calcCost(){
       double cost=(size.equalsIgnoreCase("small"))? 10:(size.equalsIgnoreCase("medium"))?12:14;
       double totalCost=cost+2*(numberOfCheeseTopping+numberOfPepperoniTopping);

        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';

    }


}
