package day36_InheritenceOOP;

public class Student {

    private String name;
    private char gender;
    private int age;
    private char grade;
    private String schoolName;
    public  static boolean isStudent=true;
    public static boolean isHuman=true;

    public Student(String name, char gender, int age, char grade, String schoolName) {
        setName(name);
        setGender(gender);
        setAge(age);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M'))
            return;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90)
            return;
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'))
            return;// exits the method
        this.grade = grade;



    }

    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }





}
