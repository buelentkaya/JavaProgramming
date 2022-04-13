package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Tiger extends WildAnimal{
    public Tiger(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting another animal in the forest!");
    }
}
