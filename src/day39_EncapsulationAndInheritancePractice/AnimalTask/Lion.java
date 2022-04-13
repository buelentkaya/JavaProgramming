package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Lion extends WildAnimal{
    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a gazelle!!!");
    }
    public void rest(){
        System.out.println(getName()+" is having a rest under a Tree.");
    }
}
