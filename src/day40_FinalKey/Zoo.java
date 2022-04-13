package day40_FinalKey;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog("Karabas","Kangal",'M',"White","Large",3);
       // dog.getBreed("Husky"); cannot be assigned since it is final

       // dog.getName("Max"); dog class is final so not once more assigment made.
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();

        Dog dog1=new Dog("Max","Husky",'F',"White","Large",2);
        System.out.println(dog1);

    }
}
