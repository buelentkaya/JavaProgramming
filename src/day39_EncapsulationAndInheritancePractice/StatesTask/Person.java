package day39_EncapsulationAndInheritancePractice.StatesTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name cannot be null");
            System.out.println(1);// 1 means that something went rong
            // 0 verirsen programi sonlamdirir ama 1 verirsen bi seyler ters gitti
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid Name");
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.err.println("Invalid Input for the age:" + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid Gender Input");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
       setGender(gender);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleeping() {
        System.out.println(name + " is sleeping");
    }





    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

