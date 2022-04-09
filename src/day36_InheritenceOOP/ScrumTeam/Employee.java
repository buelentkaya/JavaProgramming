package day36_InheritenceOOP.ScrumTeam;

public class Employee extends Person{
    public int id;
    public String jobTitle;
    public double salary;
    public String company;

    public void setInfo(String name, int age, char gender ,int id, String jobTitle, String company,double salary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.company=company;
        super.setInfo(name, age, gender);
    }
    public void work(){
        System.out.println(name+" is working as a/n"+jobTitle);
    }


    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
