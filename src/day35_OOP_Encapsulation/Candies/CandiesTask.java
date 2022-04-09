package day35_OOP_Encapsulation.Candies;

public class CandiesTask {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public CandiesTask(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("Invalid quantity :"+quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("Invalid Price"+price);
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
    public double calcCost(){
        return  quantity * price;
    }

    public String toString() {
        return "CandiesTask{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=$" + price +
                ", hasPeanuts=" + hasPeanuts +
                ", unit price=$" + ( (price==0)?"Free":"$"+price) +
                '}';
    }
}
