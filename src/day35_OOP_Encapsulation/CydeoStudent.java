package day35_OOP_Encapsulation;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String SchoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {

        SchoolName = "CYDEO";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName() {
        System.out.println("School is " + SchoolName);
    }

    public static void printProgrammingLanguage() {
        System.out.println("Language is " + programmingLanguage);

    }

    public static void printSecretCode() {
        System.out.println("code is " + secretCode);
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name+ " is attending class");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + SchoolName + '\'' +
                ", programming<language='" + programmingLanguage + '\'' +
                '}';
    }
}
