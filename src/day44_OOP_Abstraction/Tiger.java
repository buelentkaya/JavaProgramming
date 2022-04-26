package day44_OOP_Abstraction;

public final class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }
}
