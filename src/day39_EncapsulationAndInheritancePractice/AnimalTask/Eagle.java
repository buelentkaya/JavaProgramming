package day39_EncapsulationAndInheritancePractice.AnimalTask;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting a rabbit!!!");
    }
    public void fly(){
        System.out.println(getName()+ " is flying in the sky!!");
    }
}
