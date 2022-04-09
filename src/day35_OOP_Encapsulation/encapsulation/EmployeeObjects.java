package day35_OOP_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee p1=new Employee("Tatiana",'F',45,70000);
        System.out.println(p1);//Employee{name='Tatiana', gender=F, age=45, salary=70000.0}

        p1.setAge(32);
        System.out.println(p1);//Employee{name='Tatiana', gender=F, age=32, salary=70000.0}


        Employee p2=new Employee("Aygun",'F',32,115000);

        p2.setSalary((p2.getSalary()+15000));//salary=130000.0
        System.out.println(p2);//Employee{name='Aygun', gender=F, age=32, salary=130000.0}


    }
}
