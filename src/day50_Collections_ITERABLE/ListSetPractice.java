package day50_Collections_ITERABLE;

import day22_MultiDimensionalArray.MultiDimensionalArrayIntro;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 1, 2, 3, 4));
        System.out.println("set = " + set);//set = [1, 2, 3, 4, 5, 6, 7, 8, 9]

        Integer[] array = set.toArray(set.toArray(new Integer[0]));
        System.out.println(Arrays.toString(array));//[1, 2, 3, 4, 5, 6, 7, 8, 9]


        List<Integer> list = new ArrayList<>(set);

        System.out.println("list = " + list);//list = [1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println(list.get(3));//4  that is, we could reach the index


        //  List<String> names = null;
        // System.out.println(names.size());




    }
}
