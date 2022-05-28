package day53_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class PracticeTask3Predicate {
    public static void main(String[] args) {

//3.1 Create a function that can verify if a strong contains duplicated characters
        Predicate<String> isDuplicated = s -> {
            boolean result = false;
            String[] arr = s.split("");
            for (String eachChar : arr) {
                int frequency = Collections.frequency(Arrays.asList(arr), eachChar);
                if (frequency == 1) {
                    result = true;
                    break;
                }
            }
            return result;
        };

        String str = "aabcccdeeeef";

        System.out.println(isDuplicated.test(str));//true

        //3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
        //		        1 Password must be at least have 8 characters long, and should not contain space

        Predicate<String> isStrong=s -> {
            boolean result =false;
            char[] arr=s.toCharArray();




return result;
        };








        //		        2 PassWord should at least contain one upper case letter
        //		        3 PassWord should at least contain one lower case letter
        //		        4 Password should at least contain one special characters
        //		        5 Password should at least contain a digit





















    }
}