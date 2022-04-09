package day35_OOP_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1=new Person();
       //person1.name;
       //person1.age;

        person1.setName("Bülent");
        person1.setAge(228);

        System.out.println(person1.getAge()+"  :  "+person1.getName());









    }
}
