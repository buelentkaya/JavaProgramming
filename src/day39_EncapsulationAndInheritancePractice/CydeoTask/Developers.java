package day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Developers extends Employee{

    public Developers(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }
    public void fixingBugs(){
        System.out.println(getJobTitle()+getName()+ " is fixing the Bugs");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+ " is developing the Application");
    }
}
