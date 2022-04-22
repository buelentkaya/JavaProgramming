package day41_Exceptions_Intro;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        try{
            System.out.println(arr[10]);
            System.out.println("Try block");
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("catch block");
            System.exit(0);
        }finally{
            System.out.println("Finally block");

        }
    }
}
