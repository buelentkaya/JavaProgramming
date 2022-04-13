package day39_EncapsulationAndInheritancePractice.StatesTask;

public class Student extends Person {
    private int studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null) {
            System.err.println("fileOfStudy cannot be null");
            System.out.println(1);// 1 means that something went rong
            // 0 verirsen programi sonlamdirir ama 1 verirsen bi seyler ters gitti
        }
        if (fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()) {
            System.err.println("Invalid fileOfStudy");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("Invalid grade Input");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);

        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void study(){

   }

    @Override
    public String toString() {
        return "Student{" +
                "name='" +  getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
