package day50_Collections_ITERABLE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        //remove all the element that are lee than 4
        list.removeIf(p -> p < 4);
        System.out.println("list = " + list);//list = [4, 5, 4, 5, 4, 5]


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }
        System.out.println("list = " + list);//list = [2, 4, 5, 2, 4, 5, 2, 4, 5]



        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        //remove all the element that are less than 4

        Iterator<Integer> it = list2.iterator();

        /*boolean r1 = it.hasNext();// bu bize listedeki degerleri sirayla ulasmamizi saglar

        System.out.println(r1); //1


        System.out.println(it.next());

        boolean r2 = it.hasNext();

        System.out.println(r2);//2

        System.out.println(it.next());  */

        while (it.hasNext()) {
            if (it.next() < 4) {
                it.remove();
            }
        }

        System.out.println("list2 = " + list2);//list2 = [4, 5, 4, 5, 4, 5]


        System.out.println("===================================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
//remove all the element that are less than 4
        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){
            if(i.next() < 4 ){
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("===================================================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each ->  each < 4 );

        System.out.println(list4);






    }
}
