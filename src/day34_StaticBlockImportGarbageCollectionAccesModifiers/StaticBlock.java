package day34_StaticBlockImportGarbageCollectionAccesModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {
        System.out.println("static method 1");
    }

    static {
        System.out.println("static method 2");
    }
    static {
        System.out.println("static method 3");
    }


}
