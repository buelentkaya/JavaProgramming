package day36_InheritenceOOP.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog("Max","Husky",'F',2,"Large","White");
        dog.setInfo("Max","Husky",'F',2,"Large","White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.bark();
        dog.move();
        System.out.println(dog);

        Cat cat =new Cat("Mirmir","Van",'M',2,"Small","Yellow");
        cat.setInfo("Mirmir","Van",'M',2,"Small","Yellow");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();

        Tiger tiger=new Tiger("Sher Khan","Bengal",'F',4,"Large","Red");
        tiger.setInfo("Sher Khan","Bengal",'F',4,"Large","Red");
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        tiger.drink();


        //System.out.println(tiger);

    }
}
