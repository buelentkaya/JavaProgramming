package day39_EncapsulationAndInheritancePractice.StatesTask;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+" is making MAster Degree.");
    }
}
