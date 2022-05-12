package day47_OOPP_Polymorphism;

import day44_OOP_Abstraction.animalTask.Animal;
import day44_OOP_Abstraction.animalTask.Dog;
import day45_Abstraction_Interface.shape.Circle;
import day45_Abstraction_Interface.shape.Shape;
import day45_Abstraction_Interface.shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        // Shape shape=(Shape) new Circle(4);upcasting implicitly
        Shape shape2 = new Circle(5);

        //WebDriver driver=(ChromeDriver)new ChromeDriver();
        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");
      //  Dog dog1 =new Dog("Max","Husky",'M',3,"Small","White");

        Dog dog1 = (Dog) animal;

        System.out.println(animal.getName());
        System.out.println(dog1.getName());


      //animal.bark();
        ((Dog)animal).bark();

        dog1.bark();


        Shape shape1=new Square(5);

        System.out.println(((Square) shape1).getSide());


    }
}
