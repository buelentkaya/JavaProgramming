package day37_Inheritance.animal;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Husky", 'M', 2, "Large", "White", 4);
        System.out.println(dog1);
        dog1.bark();
        dog1.sleep();
        Cat cat1 = new Cat("Mirmir", "VAn", 'F', 2, "Small", "Orange");
        System.out.println(cat1);
        cat1.scratch();
        cat1.sleep();
        Parrot parrot1 = new Parrot("Pirate", "Macav", 'M', 3, "small", "colorfull", "Red");
        System.out.println(parrot1);
        parrot1.speak();
        parrot1.sleep();
    }
}
