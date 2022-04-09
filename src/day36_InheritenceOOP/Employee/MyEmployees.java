package day36_InheritenceOOP.Employee;

import day32_ConstructerOverlooding.Test;

public class MyEmployees {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.setInfo("Ömer",'M',21,"Developer",123,75000,"Amazon Inc");
        System.out.println(developer);

        Driver driver=new Driver();
        driver.setInfo("Kerem",'M',27,"Driver",321,55000,"BMW");
        System.out.println(driver);

        Teacher teacher=new Teacher();
        teacher.setInfo("Burcin",'F',44,"Teacher",852,60000,"O&P School");
        System.out.println(teacher);

        Tester tester =new Tester();
        tester.setInfo("Bulent",'M',47,"Tester",789,75000,"Kaya Inc");

        System.out.println(tester);

    }
}
