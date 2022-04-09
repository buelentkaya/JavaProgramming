package Day29ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
/*
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);  //list = [2, 4, 6, 8, 1, 2, 4, 6, 8, 1, 2, 4, 6, 8]
            }

        }

 */
        System.out.println("list = " + list);
// Lambda Expressions
        list.removeIf(p -> p <5);// removes all the element igger then 5.

        System.out.println("list = " + list);//list = [5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]

        System.out.println(".............remove Even numbers..........................");
        
        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each%2==0);
        System.out.println("list2 = " + list2);//list2 = [1, 3, 5, 7, 9]

        System.out.println(".............String. without words begint with J........................");

        ArrayList<String>list3=new ArrayList<>();
        list3.addAll((Arrays.asList("Java","Phython","c++","Javascript")));
        list3.removeIf(p-> p.startsWith("J"));
        System.out.println("list3 = " + list3);//list3 = [Phython, c++]

        System.out.println(".....................................");


        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Ömer","Eye","Level","Bera","Kerem","Tarik"));

        names.removeIf(name -> StringUtility.isPalindrome(name));
        System.out.println("names = " + names);//names = [Ömer, Bera, Kerem, Tarik]

        // names.removeIf(name -> !StringUtility.isPalindrome(name));
        //System.out.println("names = " + names);//names = [Anna, Eye, Level]








    }
}
