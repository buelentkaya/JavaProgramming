package day37_Inheritance.ScrumTask;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings,numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        // when we need more once to initialise these static variable then we need static block otherwise
        //we can initialise right away without static block
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }

    public static void printPlanetName(){
        System.out.println("Plane name is "+planet);
    }// static methon icerisinde instance variable kullanmayiz

    public  void eat(String food){// bu void oldugu icin static olmadigi icin instance veriyi name i kullanbiliyoruz
        System.out.println(name+"is eating"+food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+ drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
