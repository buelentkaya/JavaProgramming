package day31Constructer;

public class Attributes {

    public String name;
    public int unitPrice, quantity;

    public Attributes(String name, int unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int calcCost(){
      return unitPrice*quantity;
    }

    public String toString() {
        return "Attributes{" +
                "name='" + name + '\'' +
                ", unitPrice=$" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=$" + calcCost() +
                '}';
    }
}
