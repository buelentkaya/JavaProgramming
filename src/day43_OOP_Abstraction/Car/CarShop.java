package day43_OOP_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {

        Honda honda=new Honda("Accord","White",2021,30000);
        Audi audi=new Audi("Q7","Blue",2020,45000);
        Tesla tesla=new Tesla("Model3","Whote",2022,100000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println();
        honda.setColor("Red");
        audi.setPrice(100000);
        tesla.setColor("Green");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);
        System.out.println();
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
