package day39_EncapsulationAndInheritancePractice.StatesTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+ "is stuying on thesis.");
    }
}
