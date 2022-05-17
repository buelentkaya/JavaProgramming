package day49_Collection;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);
        //linkedhashSet ile duplicate olanlari atip tekrar array cevirmis olduk.

/*
        Set<String> set1=new HashSet<>();

        set1.addAll(Arrays.asList(arr));
        System.out.println("set1 = " + set1);
        //set1 = [Paper towels, Wooden Spoon, Book, Phone, Coke, Pen, Eggs, Milk]  just random


        arr=set1.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        //[Paper towels, Wooden Spoon, Book, Phone, Coke, Pen, Eggs, Milk]

*/
        System.out.println(Arrays.toString(arr));
        //[Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));
        System.out.println(list);//[1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10]


        list = new ArrayList<>(new LinkedHashSet<>(list)); //tek satirlik kod ile duplikationi önledik

        System.out.println(list);
        //[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]
        System.out.println("-----------------------------------------------");


        String[] array = {"A", "A", "B", "C"};

        List<String> s = new ArrayList<>(Arrays.asList(array));

        s.addAll(Arrays.asList("E", "F", "G"));

        System.out.println("-----------------------------------------------");

        Integer[] nums = {1, 2, 1, 1, 2, 2, 2, 3, 3, 3, 3, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));
        //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  tek satir kodla tüm tekrarlari halettik

        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        //  eabcd
        //  54434


        String result = ""; //e5a4b4c4d3


        for(String each:new LinkedHashSet<>(Arrays.asList(str.split("") ) ) ){
           // int count=Collections.frequency(Arrays.asList(str.split("") ),each);
           // result +=each+Collections.frequency(Arrays.asList(str.split("") ),each);

            result += each + Collections.frequency(  Arrays.asList(str.split("")) ,  each);
            // split ile her bir karakteri ayirip aslIst ile array a ekliyoruz
             //  each= herbir karakteri   +   o karakterin tekrar sayisini gösteriyor
        }
        System.out.println(result);//e10a4b4c4d3


        System.out.println("----------------------------------------------------------");


    }
}
