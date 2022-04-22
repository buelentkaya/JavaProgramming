package day41_Exceptions_Intro;

import day39_EncapsulationAndInheritancePractice.CydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Employee employee=null;
        try {
            System.out.println(employee.getSalary());//.NullPointerException
        }catch (IndexOutOfBoundsException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){// runtime hep en sona yazilir daha önca yazilrsa hata verir video 41 day 2:42
            System.out.println("fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test completed");

    }
}
