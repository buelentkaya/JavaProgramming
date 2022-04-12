package day38_InheritanceMethodOverriding.EmployeeTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(name+" from "+companyName+ " is working as a product owner!");
    }
}
