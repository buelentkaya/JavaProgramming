package Day30CostumClass;

public class Car {
    public String brand;
    public  String model;
    public String color;
    public int year;
    public int price;

    public void setInfo(String brandOfTheCar,String modelOfTheCar,String colorOfTheCar,int yearOfTheCar,int priceOfTheCar){
        brand=brandOfTheCar;
        model=modelOfTheCar;
        color=colorOfTheCar;
        year=yearOfTheCar;
        price=priceOfTheCar;

    }

    public void drive(){
        System.out.println(brand+" "+model+" drives.");
    }
    public void start(){
        System.out.println(brand+" "+model+" starts.");
    }
    public void stop(){
        System.out.println(brand+ " "+model+" stops.");
    }


    public String toString() {
        return "day_32ConstructerOverlooding.Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }
}
