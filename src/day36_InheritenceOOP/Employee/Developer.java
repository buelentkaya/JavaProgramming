package day36_InheritenceOOP.Employee;

public class Developer extends Employee{

public void code(){
    System.out.println(name+ "is coding right now.");
}
public void fixingBugs(){
    System.out.println(name+" is fixing bugs.");
}


    public String toString() {
        return "Developer{" +
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
