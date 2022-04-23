package day42_Exceptions_Continue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {
    public static void main(String[] args) {
        System.out.println("Enter your age :");
        int age=new Scanner(System.in).nextInt();
        if(age<0){
           // System.out.println("Invalid age:" +age);
            //System.exit(0);
            throw new InputMismatchException("Age can not be negative: "+ age);// manually is created.

        }
        if(age>21&&age<120){
            System.out.println("You are eligible");

        }else{
            throw new RuntimeException("You must be at least 21 or at most 119 years old");
        }
    }
}
