package day39_EncapsulationAndInheritancePractice.CydeoTask;

public class Teachers extends Employee{
    public Teachers(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+getName()+ " is teaching something to the class.");
    }
}
