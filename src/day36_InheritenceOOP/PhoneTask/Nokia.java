package day36_InheritenceOOP.PhoneTask;

public class Nokia extends Phone{
    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as a self defence tool");
    }


    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
