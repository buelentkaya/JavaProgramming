package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Karabas", "Kangal", 'F', 2, "Large", "White", false, true, true);
        Cat cat = new Cat("Minnos", "Van", 'F', 2, "Medium", "Yellow", false, true, true);
        Dolphin dolphin = new Dolphin("Wave", "nature", 'M', 1, "Medium", "Grey", true, true, true);
        Parrot parrot = new Parrot("Pirate", "Mokaw", 'F', 3, "Small", "colorfull", true, true, true);

        Lion lion = new Lion("King", "Africa", 'M', 5, "Large", "Yellow", true, false, false);
        Tiger tiger = new Tiger("Tiger", "Africa", 'F', 7, "Large", "Yellow", true, false, false);
        Eagle eagle = new Eagle("Micir", "Canada", 'F', 3, "Midel", "Black", true, false, false);
        Bear bear = new Bear("Teddy", "Polar", 'M', 3, "Large", "Brown", true, false, false);


        dog.eat();
        cat.meow();
        dolphin.swim();
        parrot.fly();
        parrot.sing();
        lion.hunt();
        tiger.getName();
        tiger.eat();
        eagle.fly();
        bear.setName("Winnie the Pooh");
        System.out.println(bear);

    }
}
