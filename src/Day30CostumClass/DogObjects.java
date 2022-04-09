package Day30CostumClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();// Dog object is now created...
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Medium";
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 7;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White";

        Dog dog3 = new Dog();
dog3.setInfo("Jack","GermanShepard",3,'M',"Large","Black");

Dog dog4=new Dog();
dog4.setInfo("Karabas","Sivas Kangal",5,'M',"Large","Black&White");


Dog dog5=new Dog();
dog5.setInfo("Findik","Pit-Bull",3,'F',"Medium","Grey");




Dog[] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog>femaleDogs=new ArrayList<>();
        femaleDogs.removeIf(p->p.gender=='M');
        System.out.println("femaleDogs = " + femaleDogs);
        
        
        ArrayList<Dog>maleDogs=new ArrayList<>();





        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);

        dog1.eat();
        dog2.eat();
        dog3.eat();
        dog2.bark();
        dog3.bark();









    }
}
