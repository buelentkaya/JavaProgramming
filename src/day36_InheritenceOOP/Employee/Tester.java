package day36_InheritenceOOP.Employee;

public class Tester extends Employee{
    public void test(){
        System.out.println(name + " is testing ");
    }
    public void creatTicket(){
        System.out.println(name+ "is creating a ticket.");

    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
