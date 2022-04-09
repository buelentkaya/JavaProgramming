package day37_Inheritance.animal;

public class Parrot extends Animal{
    public String parrotWingColor;// extra feature without inheritance
    public Parrot(String name, String breed, char gender, int age, String size, String color,String parrotWingColor) {
        super(name, breed, gender, age, size, color);
        this.parrotWingColor=parrotWingColor;
    }

    public void speak(){
        System.out.println(name+" is speaking");
    }
}
