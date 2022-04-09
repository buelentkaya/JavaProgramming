package day37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender, String language, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, language, jobTitle, ID, salary, companyName);
    }

    public void analyze(){
        System.out.println(jobTitle+" "+name+" is analysing documents");
    }
}
