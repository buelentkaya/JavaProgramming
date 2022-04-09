package day37_Inheritance.ScrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String language, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, language, jobTitle, id, salary, companyName);
    }
    public void createTicket(){
        System.out.println(jobTitle+" "+name+ " is creating a Ticket");
    }
}
