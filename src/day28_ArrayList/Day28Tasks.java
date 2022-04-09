package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day28Tasks {
    public static void main(String[] args) {

        // 1. write a program that can set the last element of the Integer arraylist to zero

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); //[1, 2, 3, 4, 5]
        list.set(list.size() - 1, 0);//[1, 2, 3, 4, 0]
        System.out.println(list);






        System.out.println(" ---------SWAP---------------------- ");
        //  2. write a program that can swap the first and last elements of
        //  an integer arraylist

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        Collections.swap(list1,0,4);
        System.out.println("list1 = " + list1);

        int temp = list1.get(0);//ilk karaakteri bu bardakta tutuyoruz sonra lazim olacak diye
        // the IndexOf"0"        changes with the last index of list1 5-----
        list1.set(0, list1.get(list1.size() - 1));//[5, 2, 3, 4, 5]
        list1.set(list1.size() - 1, temp);
        System.out.println("list1 = " + list1);//list1 = [5, 2, 3, 4, 1]






        System.out.println(" ------------multiply odd number------------------- ");
//3. write a program that can multiply each odd number by 2

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list2.size(); i++) {

            if (list2.get(i) % 2 != 0) {
                list2.set(i, list2.get(i) * 2);
            }
        }

        System.out.println("list2 = " + list2);


        System.out.println(" ------------Combine2 String------------------ ");
        //4.write a program that can combine two String arrays into one arrayList


        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list3 = new ArrayList<>();

        for (String each : arr1) {
            list3.add(each);
        }
        for (String each : arr2) {
            list3.add(each);
        }

        System.out.println(list3);// [A, B, C, D, E, F, G]


        System.out.println(" ------------Maximum NUmber----------------- ");

        //5. Write a program that can find the maximum number from an ArrayList of integers

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5));


        int max = list4.get(0);
        for (int each : list4) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);//5

        System.out.println(" ------------Minimum NUmber----------------- ");
        //6. Write a program that can find the minimum number from an ArrayList of integers

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5));

        int min = list5.get(0);

        for (int each : list5) {
            if (each < min) {
                min = each;
            }

        }
        System.out.println(min);//1


        System.out.println(" ------------RETURN THE FIRST DUPLICATED ELEMENT---------------- ");
        //7.  Write a program that can return the first duplicated element from an arrayList of Integer

        ArrayList<Integer> list6 = new ArrayList<>();

        list6.addAll(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 7));

        int firstDupElement = 0;

        for (Integer each : list6) {
            int frequency = 0;

            for (Integer element : list6) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency > 1) {
                firstDupElement = each;
                break;
            }
        }
        System.out.println("firstDuplicatedElement = " + firstDupElement);
       //firstDuplicatedElement = 2
    }
}
