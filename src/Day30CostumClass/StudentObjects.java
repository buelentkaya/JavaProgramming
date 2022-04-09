package Day30CostumClass;
import java.util.ArrayList;
public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();

        student1.setInfo("Ömer Bera",'M',21,12456987,'A');
        student2.setInfo("Kerem Kaya",'M',17,12456129,'B');
        student3.setInfo("Tarik Ata",'M',19,326549,'C');
        student4.setInfo("Burcin",'F',23,65412367,'B');
        student5.setInfo("Ayshe",'F',21,65423654,'D');

        Student[] students={student1,student2,student3,student4,student5};

      for(Student student:students){
          System.out.println(student);
      }
        System.out.println("..........EarlyBIrds.........");
        ArrayList<Student>earlyBirds=new ArrayList<>();
        ArrayList<Student>angryBirds=new ArrayList<>();

        for(Student student:students){
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("earlyBirds = " + earlyBirds);












    }
}
