package day41_Exceptions_Intro;

import day39_EncapsulationAndInheritancePractice.StatesTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {
        //unchecked exception:

        int a=10;
        int b=0;

       // System.out.println(a/b);// it occurs during the runtime.
        // ArithmeticException: / by zero
        System.out.println("Wooden Spoon"); // this code is not executed!!!!!!!!! either
        char[] characters={'A','B','C'};
       // System.out.println(characters[99]);//ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3

        Student student=null;
      //  System.out.println(student.getStudentId());//Exception in thread "main" java.lang.NullPointerException
//student.study();  Exception in thread "main" java.lang.NullPointerException

String str="Wooden Spoon";
str=null;
     //   System.out.println(str.toUpperCase());//Exception in thread "main" java.lang.NullPointerException

// checked exceptions

      //  System.out.println("java.charAt(0));   runtime error

    }

}
