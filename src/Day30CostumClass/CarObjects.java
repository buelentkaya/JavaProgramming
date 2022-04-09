package Day30CostumClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setInfo("Ford", "Focus", "Grey", 2006, 2000);
        car2.setInfo("VolksWogen", "Polo", "Black", 2016, 75000);
        car3.setInfo("BMW", "3.20", "White", 2021, 21000);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

        car1.drive();
        car2.start();
        car3.stop();

        Car[] cars = {car1, car2, car3};

        System.out.println(Arrays.toString(cars));
//[day_32ConstructerOverlooding.Car{brand='Ford', model='Focus', color='Grey', year=2006, price=$2000},
// day_32ConstructerOverlooding.Car{brand='VolksWogen', model='Polo', color='Black', year=2016, price=$75000},
// day_32ConstructerOverlooding.Car{brand='BMW', model='3.20', color='White', year=2021, price=$21000}]

        System.out.println("..................................");

        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3));
        //carsList.addAll(Arrays.asList(car1, car2, car3));
        System.out.println("carsList = " + carsList);
//carsList = [day_32ConstructerOverlooding.Car{brand='Ford', model='Focus', color='Grey', year=2006, price=$2000},
// day_32ConstructerOverlooding.Car{brand='VolksWogen', model='Polo', color='Black', year=2016, price=$75000},
// day_32ConstructerOverlooding.Car{brand='BMW', model='3.20', color='White', year=2021, price=$21000}]

        for (Car each : carsList) {
            System.out.println(each.brand + " : " + each.price);
        }
//Ford : 2000
//VolksWogen : 75000
//BMW : 21000
        System.out.println("..................................");

        carsList.removeIf(p -> p.brand.equals("Ford") && p.year >= 2005 && p.year <= 2010);
        carsList.removeIf(p->p.brand.equals("BMW")&&p.year>=1995&&p.year<=2007);
        System.out.println("carsList = " + carsList);

    }
}
