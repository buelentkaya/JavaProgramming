package day36_InheritenceOOP.animalTask;

public class Cat extends Animal{//Cat is an Animal
    public void meow(){
        System.out.println(name+" is meowing");
    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }

}
/*
Cat inherits 6 variable and 6 methods from Animal Class.
 */