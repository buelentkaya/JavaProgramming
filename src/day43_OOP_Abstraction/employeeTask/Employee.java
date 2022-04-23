package day43_OOP_Abstraction.employeeTask;

public class Employee extends Person{

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }
}
