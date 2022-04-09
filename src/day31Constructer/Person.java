package day31Constructer;

public class Person {
    public String name;
    public char gender;
    public int age;

    public Person(String name,char gender,int age){// constructer
        this.name=name;
        this.gender=gender;
        this.age=age;    // three parameters
    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
