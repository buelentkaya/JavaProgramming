package day36_InheritenceOOP.animalTask;

public class Tiger extends Animal{
    public Tiger(String max, String husky, char m, int i, String small, String white) {
        super(max, husky, m, i, small, white);
    }// Tiger is an Animal and inherits from AnimalClass

    public void roar(){
        System.out.println(name+" is roaring");
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }



}
