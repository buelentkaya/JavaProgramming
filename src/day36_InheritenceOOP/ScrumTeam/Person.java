package day36_InheritenceOOP.ScrumTeam;

public class Person {
    public String name;
    public  int age;
    public  char gender;

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name +" is eating something.");
    }
    public void drink(){
        System.out.println(name +" is drinking something.");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
