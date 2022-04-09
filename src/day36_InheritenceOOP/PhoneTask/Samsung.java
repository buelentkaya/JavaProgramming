package day36_InheritenceOOP.PhoneTask;

public class Samsung extends Phone {


public void freeze(){
        System.out.println(brand +" "+ model+" is always freezing");
    }


    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
