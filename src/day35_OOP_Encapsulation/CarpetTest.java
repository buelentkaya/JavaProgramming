package day35_OOP_Encapsulation;

import day32_ConstructerOverlooding.Car;

public class CarpetTest {
    public static void main(String[] args) {

        Carpet carpet=new Carpet(4,5,8,true);
        System.out.println(carpet);

        System.out.println(carpet.calcCost());

    }
}
