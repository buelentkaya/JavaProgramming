package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;


public class PracticeTask1 {
    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number from a list of Integer

        Function<List<Integer>, Integer> findTheMax = list -> {

            return Collections.max(list);
        };

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));

        System.out.println(findTheMax.apply(list));//34





        //1.2 Create a function that can return the minimum number from a list of Integer

        Function<List<Integer>, Integer> findMinimum = list1 -> {
            return Collections.min(list);
        };

        System.out.println(findMinimum.apply(list));//1





//		1.3 Create a function that can return the longest String from a List of String

        Function<List<String>, String> longestString = sList -> {
            String longestElement = "";

            for (String each : sList) {
                if (each.length() > longestElement.length()) {
                    longestElement = each;
                }
            }
            return longestElement;
        };
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println(longestString.apply(days));  //Wednesday





//		1.4 Create a function that can return the shortest String from a List of String

        Function<List<String>, String> minString = s -> {
            String shortestElement = s.get(0);

            for (String each : s) {
                if (each.length() < shortestElement.length()) {
                    shortestElement = each;
                }
            }
            return shortestElement;
        };
        System.out.println(minString.apply(days));




//		1.5 Create a function that can convert List of integer to int array

        Function<List<Integer>, int[]> listToArray = l -> {
            int[] arr = new int[l.size()];
            for (int i = 0; i < l.size(); i++) {
                arr[i] = l.get(i);
            }

            return arr;
        };
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(Arrays.toString(listToArray.apply(list5)));  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]




//		1.6 Create a function that can convert List of double to double array

        Function<List<Double>, double[]> listToDoubleArray = dL -> {
            double[] array = new double[dL.size()];
            for (int i = 0; i < dL.size(); i++) {
                array[i] = dL.get(i);
            }
            return array;
        };

        List<Double> list3 = new ArrayList<>(Arrays.asList(1.3, 2.78, 30.8, 14.9, 5.0, 66.8, 7.0, 8.9, 99.0, 100.9));
        System.out.println(Arrays.toString(listToDoubleArray.apply(list3)));
        //[1.3, 2.78, 30.8, 14.9, 5.0, 66.8, 7.0, 8.9, 99.0, 100.9]

    }
}
