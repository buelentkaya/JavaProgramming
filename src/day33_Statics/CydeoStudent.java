package day33_Statics;

public class CydeoStudent {
    public String name;
    public int age,id,batchNumber,groupNUmber;
    public char gender,grade;
    public  static String schoolName="Cydeo School";

    public  static String programmingLanguage="Java";

    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNUmber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNUmber = groupNUmber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying. ");
    }
    public  void attendClass(){
        System.out.println(name+ " is attending class.");
    }

    public static void setSchoolInfo(){
        System.out.println("School name is "+ schoolName);
    }
    public  static void setProgrammingLanguage(){

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", GroupNUmber=" + groupNUmber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", School name=" + schoolName +
                ", Programming Language=" + programmingLanguage +
                '}';
    }



}
