package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting Gazelle in the pond ");
    }
    public void cry(){
        System.out.println(getName()+ " is crying after eating that cute gazelle!");
    }
}
