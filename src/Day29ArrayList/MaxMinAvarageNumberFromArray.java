package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinAvarageNumberFromArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 55, 44, 55, 66, 11, 22, 3, 1, 2));
        System.out.println(list);//[1, 2, 3, 4, 5, 55, 44, 55, 66, 11, 22, 3]
  //int max=Collections.max(list);   int max=Collections.min(list);
 //       System.out.println(max);
        int max=list.get(0);
        int min=list.get(0);
        int sum=0;
        for(Integer each:list) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
           sum+=each;

        }
        double  avarage= sum/ list.size();

        System.out.println("min = " + min);//1
        System.out.println("max = " + max);//66
        System.out.println("avarage = " + avarage);//19.0










    }
}
