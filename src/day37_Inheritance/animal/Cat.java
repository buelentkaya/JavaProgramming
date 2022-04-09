package day37_Inheritance.animal;

public class Cat extends Animal{  // Animal yanina curseri getir ardindan 'Alt' a bas ve iki kez enter otomatik cikiyor super key word


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public  void scratch(){
        System.out.println(name+" is scratching");
    }
}
