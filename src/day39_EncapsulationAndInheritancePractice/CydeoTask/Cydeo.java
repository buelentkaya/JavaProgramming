package day39_EncapsulationAndInheritancePractice.CydeoTask;

import day37_Inheritance.ScrumTask.Developer;

public class Cydeo {
    public static void main(String[] args) {

        Developers developer = new Developers("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teachers teacher = new Teachers("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println("******************************************************");

        tester.setName("Bulent");
        tester.setAge(47);
        System.out.println(tester);

        developer.work();
        tester.work();
        student.study();

        tester.eat();
        tester.drink();
        tester.sleeping();

        // tester.fixingBugs();
        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleeping();

        // teacher.fixingBugs();
        //  teacher.createTicket();

        System.out.println("------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleeping();

        // student.fixingBugs();
        // student.createTicket();
        student.study();

    }
}
