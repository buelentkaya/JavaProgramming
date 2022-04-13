package day40_FinalKey;

public final  class Dog extends Animal{
    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName()+" is eating dog food!.");
    }

   /* public void drink(){     we cannot override this since it ie final drink method so it is restricted.
        System.out.println(getName()+ "is drinking coke!");
    }
  */

    public void bark(){
        System.out.println(getName()+ " is barking..");
    }
}
