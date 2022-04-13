package day39_EncapsulationAndInheritancePractice.StatesTask;

public class StudentObjects {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent=new CydeoStudent("Bulent",47,'M',123,"SoftwareTesting",'A',8,28,"Java");
        System.out.println(cydeoStudent);

cydeoStudent.setProgrammingLanguage("C++");
cydeoStudent.setAge(46);
        System.out.println(cydeoStudent);
    }
}
