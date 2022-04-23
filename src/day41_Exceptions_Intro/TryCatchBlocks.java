package day41_Exceptions_Intro;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test Started");

        try {
            System.out.println(9 / 0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
            System.out.println("Try Block");

        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception is occurred");
        }
        System.out.println("Test 1 Completed");

        System.out.println("__________________________________________");
        System.out.println("Test 2 starts");

        int[] numbers = {1, 2, 3, 4, 5, 6};


        try {
            System.out.println(numbers[200]);//ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 6

            // }catch(NullPointerException e){  böyle yazarsak hata almaya devam ederiz
            System.out.println("Try block");
        } catch (RuntimeException e) {// parantez icine asagida verdigi hata kodunu yazmaliyiz
            // ya da o hata kodunun superclass adini yazabiliriz
            // yoksa hata vereye devam edecektir
            System.out.println("Catch block");
            System.out.println("Null Pointer exception was occured");
           // e.printStackTrace();  raporlama yapiyor  //java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 6
            //at day41_Exceptions_Intro.TryCatchBlocks.main(TryCatchBlocks.java:25)
        }


        System.out.println("Test 2 Completed");


        System.out.println("__________________________________________");
        System.out.println("Test 3 starts");

        try {
            System.out.println("Cydeo".substring(2, 0));
            System.out.println("try test 3 ");
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println("catch u");
        }
        System.out.println("test 3 completed");


        System.out.println("hello");

        try{ Thread.sleep(3000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Cydeo");

        System.out.println("_____________________________");

        try{
            FileInputStream file=new FileInputStream("File path");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
