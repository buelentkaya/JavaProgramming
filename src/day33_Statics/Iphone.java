package day33_Statics;

public class Iphone {

    public String model, color;
    public double price;
    public String size;

    public static String brand = "Apple", OS = "iOS", madeIn = "China";

    public Iphone(String model, String color, double price, String size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println(model+" is face timing with  number "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model+" is face timing with email "+email);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Iphone iPhone = new Iphone("iphone 12", "Black", 1000, "5.6 inches");

        System.out.println(iPhone);

        iPhone.faceTime(123456789);
        iPhone.faceTime("gmail@yahoo.com");
        iPhone.call(123456789);
        iPhone.text(123456789);


    }

}

/*
4. IPhone Task:
		1. Create a class named IPhone:
				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */

