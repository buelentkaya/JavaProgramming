package day37_Inheritance.ScrumTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String language, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, language, jobTitle, id, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }

}
