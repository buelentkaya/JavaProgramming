package day38_InheritanceMethodOverriding.EmployeeTask;

public class Test {
    public static void main(String[] args) {
        Pilot pilot=new Pilot("Bulent",47,'M',123,"Pilot",123000,"Lufthansa");
        System.out.println(pilot);
        pilot.work();
    }
}
