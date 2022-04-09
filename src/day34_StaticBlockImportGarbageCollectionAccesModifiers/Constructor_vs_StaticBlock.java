package day34_StaticBlockImportGarbageCollectionAccesModifiers;

public class Constructor_vs_StaticBlock {

    static{
        System.out.println("Static Block");
    }
    public  Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }

}
