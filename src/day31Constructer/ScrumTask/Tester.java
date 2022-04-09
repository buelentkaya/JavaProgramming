package day31Constructer.ScrumTask;

public class Tester {
    public String name;
    public int employeeId;
    public String jobTitle;
    public double Salary;

    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=$" + Salary +
                '}';
    }


    public void smokeTesting() {
        System.out.println(name + " is smoke testing.");
    }

    public void creatTicket() {
        System.out.println(name + " is creating ticket");
    }


}
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */