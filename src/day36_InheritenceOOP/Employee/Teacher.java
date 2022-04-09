package day36_InheritenceOOP.Employee;

public class Teacher extends Employee{
    public void teach(){
        System.out.println(name+ " is teaching something to students.");
    }



    public String toString() {
        return "Teacher{" +
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
