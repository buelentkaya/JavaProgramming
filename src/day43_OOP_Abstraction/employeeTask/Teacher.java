package day43_OOP_Abstraction.employeeTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is teaching something to the students");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is sleeping in front of the class");
    }
}
