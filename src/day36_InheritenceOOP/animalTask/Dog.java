package day36_InheritenceOOP.animalTask;

 public class Dog extends Animal{
     public Dog(String max, String husky, char m, int i, String small, String white) {
         super(max, husky, m, i, small, white);
     }// Dodg is an Animal

     public void bark(){
         System.out.println(name+" is barking");
     }


 }

  /*
  dog:
  6 variables
  6 methods  inherited from super class, Animal
   */








