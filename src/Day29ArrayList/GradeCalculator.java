package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,45,73,35,47,95,69));

        ArrayList<Integer>gradeOfA=new ArrayList<>(scores);
        gradeOfA.removeIf(p->!(p>=90&&p<=100));//90,95,100
        System.out.println("gradeOfA = " + gradeOfA);

        ArrayList<Integer>gradeOfB=new ArrayList<>(scores);
        gradeOfB.removeIf(p->!(p>=80&&p<=89));
        System.out.println("gradeOfB = " + gradeOfB);//85,85

        ArrayList<Integer>gradeOfC=new ArrayList<>(scores);
        gradeOfC.removeIf(p->!(p>=70&&p<=79));
        System.out.println("gradeOfC = " + gradeOfC);//70,73

        ArrayList<Integer>gradeOfD=new ArrayList<>(scores);
        gradeOfD.removeIf(p->!(p>=60&&p<=69));
        System.out.println("gradeOfD = " + gradeOfD);//65,69

        ArrayList<Integer>gradeOff=new ArrayList<>(scores);
        gradeOff.removeIf(p->!(p>=0&&p<=59));
        System.out.println("gradeOff = " + gradeOff);//45,35,47

        System.out.println("Total number of A :"+ gradeOfA.size());
        System.out.println("Total number of B :"+ gradeOfB.size());
        System.out.println("Total number of C :"+ gradeOfC.size());
        System.out.println("Total number of D :"+ gradeOfD.size());
        System.out.println("Total number of F :"+ gradeOff.size());



    }
}
