package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Python extends WildAnimal{
    public Python(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a rat!");
    }
}
