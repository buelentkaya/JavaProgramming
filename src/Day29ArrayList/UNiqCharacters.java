package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UNiqCharacters {
    public static void main(String[] args) {
        String str="aaabcccdeefggggggggggiiiiiiiiijkkkkkkkkkkkkkkkkkkkkl";//     str=   aaabcccdeef
        System.out.println(str);
        String[]arr= str.split("");
        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        //list = [a, a, a, b, c, c, c, d, e, e, f]

        String unique ="";

        for(String each:list){
            int frequency=Collections.frequency(list,each);
            if(frequency==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);
    }
}
