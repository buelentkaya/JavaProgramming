package day50_Collections_ITERABLE;

import day22_MultiDimensionalArray.MultiDimensionalArrayIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));
   // Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        Iterator<String> it=list.iterator();

        while(it.hasNext()){// hep bi sonraki deger varsa true sonuc verir

           String each= it.next();
           String reverse="";

            for (int i = each.length() -1; i >=0; i--) {
                reverse+=each.charAt(i);
            }

           if(each.equalsIgnoreCase(reverse)){
               it.remove();

           }

        }

        System.out.println("list = " + list);

       // list = [Java, Python, Cydeo, Car]


        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        Predicate<String> palindrome = str -> {
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);
        };

        names2.removeIf(palindrome);//names2 = [Java, Python, Cydeo, Car]

        System.out.println("names2 = " + names2);

    }
}
