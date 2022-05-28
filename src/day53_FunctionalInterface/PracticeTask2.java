package day53_FunctionalInterface;


import java.util.*;
import java.util.stream.Collectors;

public class PracticeTask2 {
    public static void main(String[] args) {

        // 2.1 Create a function that can return the maximum number from an array of Integers

        ArrayFunction<Integer, Integer> findTheMax = array -> {
            return Collections.max(Arrays.stream(array).collect(Collectors.toList()));
        };

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(findTheMax.apply(arr));//10




//	1.2 Create a function that can return the minimum number from an array of Integers
        ArrayFunction<Integer, Integer> findTheMin = array -> {
            return Collections.min(Arrays.stream(array).collect(Collectors.toList()));
        };


        System.out.println(findTheMin.apply(arr));//1




//		1.3 Create a function that can return the longest String from an array of String

       ArrayFunction<String,String> findTheLongest= s->{
           String longestElement = "";

           for (String each : s) {
               if (each.length() > longestElement.length()) {
                   longestElement = each;
               }
           }
           return longestElement;
       };

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(findTheLongest.apply(days));  //Wednesday



//		1.4 Create a function that can return the shortest String from an array of String
        ArrayFunction<String,String> findTheShortest= s->{
            String shortestElement = s[0];

            for (String each : s) {
                if (each.length() < shortestElement.length()) {
                    shortestElement = each;
                }
            }
            return shortestElement;
        };
        System.out.println(findTheShortest.apply(days));  //Monday
    }
}
