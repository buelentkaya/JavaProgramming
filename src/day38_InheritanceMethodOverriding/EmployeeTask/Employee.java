package day38_InheritanceMethodOverriding.EmployeeTask;

public class Employee {
   public String  name;
   public int age;
   public char gender;
   public int id;
   public  String jobTitle;
   public double salary;
   public String companyName;

   public Employee(String name, int age, char gender, int id, String jobTitle, double salary, String companyName) {
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.id = id;
      this.jobTitle = jobTitle;
      this.salary = salary;
      this.companyName = companyName;
   }

public void work(){
   System.out.println(name+" from this "+companyName+ " is working!");
}

   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", gender=" + gender +
              ", id=" + id +
              ", jobTitle='" + jobTitle + '\'' +
              ", salary=" + salary +
              ", companyName='" + companyName + '\'' +
              '}';
   }
}
