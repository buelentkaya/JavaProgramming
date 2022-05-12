package day45_Abstraction_Interface;

public interface PropertiesOfInterface {
    /*
    public PropertiesOfInterface(int a){  constructer yok!!!
        this.a =a;
    }
    */

    /*
    static{     static block yooook
        b = 100;
    }
    */

    /*
    public void method1(){
        System.out.println("Instance method");
    }
     */

    static void method2(){
        System.out.println("Static method");
    }

    void method3();

    default void method4(){
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();

    }
}
