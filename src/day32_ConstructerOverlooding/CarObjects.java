package day32_ConstructerOverlooding;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car("Toyota");
        Car car2=new Car("Honda","Accord");
        Car car3=new Car("Ford","Focus",2016);
        Car car4=new Car("Tesla","Model 3",2019,70000,"Black");
        Car car5=new Car("Ford",">focus",2020,20000,"grey");

        ArrayList<Car>list=new ArrayList<>(Arrays.asList(car1,car2,car3,car4,car5));
        System.out.println("list = " + list);
        list.removeIf(p->!p.brand.equals("Ford"));
        System.out.println("list = " + list);
    }
}
