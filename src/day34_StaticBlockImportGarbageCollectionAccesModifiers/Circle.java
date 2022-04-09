package day34_StaticBlockImportGarbageCollectionAccesModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi=3.14;
    public  static String name="Circle";

    public static ArrayList<Integer> numbers;
    //numbers.add(); this code doesnot work here

    public Circle(double radius){
        this.radius=radius;
       // pi=3.14; it is not recommended to use in constructer as a static
    }
    static {
     //  radius=5 ; this cannot be applied here on acountf being  a instance variable
       pi=3.14;
       name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }
}
