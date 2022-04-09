package day34_StaticBlockImportGarbageCollectionAccesModifiers;

import Day30CostumClass.Dog;
import day32_ConstructerOverlooding.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
/*  /int n=null;

        String str="null";// only initiliasied with null then we can get nullexception

        System.out.println(str.toUpperCase());

*/
        String str = "Wooden Spoon";
        str = null;// now this can be suitable for the garbage collector
        System.out.println(str);//null


        Car car1=new Car("Toyota");
        car1=null;
        System.out.println(car1);

        System.out.println("--------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));




        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );

        System.out.println("-----------------------------------");

        /*Student student1 = new Student("kaya", 11);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);*/

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);






    }
}
