package day37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee{


    public ScrumMaster(String name, int age, char gender, String language, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, language, jobTitle, ID, salary, companyName);
    }

    public  void arrangeMeeting(){
        System.out.println(jobTitle+" "+name+" is arranging meetings");
    }



}
