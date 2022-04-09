package day37_Inheritance.ScrumTask;

public class Employee extends Person {
    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String language,String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, language);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;


    }


    public void work() {
        System.out.println(jobTitle+" "+name + " is working for the " + companyName);
    }

    public String toString() {
        return "Employee{" +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}

