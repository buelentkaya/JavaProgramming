package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting fish in the river!!!");
    }
    public void climb(){
        System.out.println(getName()+ " is climbing a tree in order to find HONEY!");
    }
}
