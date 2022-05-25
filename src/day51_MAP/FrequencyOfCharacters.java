package day51_MAP;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str="bbcccaaaaa";
        //           bca
        //           235

        String[] array=str.split("");

        Map<String,Integer> result=new LinkedHashMap<>();

        for (String each : array) {
            int frequency=Collections.frequency(Arrays.asList(array),each);
            result.put(each,frequency);
        }

        System.out.println("result = " + result);
               //result = {b=2, c=3, a=5}

    }
}

/*
2. Write a program that can return the frequency of characters
        Not: MUST use map

        Ex: str = "bbcccaaaaa"

        output:
            {b=2, c=3, a=5}
 */