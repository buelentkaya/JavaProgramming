package day44_OOP_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {
        Toyota toyota=new Toyota("Accord",2019,250000,"Blue");

        System.out.println(toyota);
        toyota.start();
        toyota.drive();
        toyota.stop();

        CydeoCar cydeoCar=new CydeoCar("EU8",2022,100000,"BlueSky");

        cydeoCar.autoPark();
        cydeoCar.drive();
        cydeoCar.start();
        cydeoCar.selfDrive();
        cydeoCar.autoPark();
        System.out.println(cydeoCar);
    }
}
