package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqElement {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer>unique=new ArrayList<>();

        for (Integer each : list) {
            int frequency=Collections.frequency(list,each);
            if(frequency==1){
                unique.add(each);
            }
        }
        System.out.println("unique = " + unique);//unique = [2, 4, 6, 8]


        System.out.println(".........................................");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer>unique1=new ArrayList<>(list1);

        unique1.removeIf(p->Collections.frequency(list1,p)>1);
        System.out.println("unique1 = " + unique1);//unique1 = [2, 4, 6, 8]



    }
}
