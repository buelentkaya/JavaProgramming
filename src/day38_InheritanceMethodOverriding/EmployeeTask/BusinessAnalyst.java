package day38_InheritanceMethodOverriding.EmployeeTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(name+" from "+companyName+ " is working as a business analyst!");
    }
}
