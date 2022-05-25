package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {

    public static void main(String[] args) {

       /*
 1. Write a program that can find the unique characters from a String

             Ex:
                     str = "aabcccdeeeef";

             output:
                     {b=1, d=1, f=1}

  */
        String str = "aabcccdeeeef";
        String[] array = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();


        for (String each : array) {

            int frequency= Collections.frequency(Arrays.asList(array),each);

            if(frequency==1){

                result.put(each,frequency);
            }

        }
        System.out.println("result = " + result);
         //result = {b=1, d=1, f=1}

    }

}
