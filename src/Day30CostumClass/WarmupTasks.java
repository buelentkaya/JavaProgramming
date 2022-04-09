package Day30CostumClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class WarmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(numbers, 0, numbers.size() - 1);
        System.out.println(numbers);//[8, 2, 3, 4, 5, 6, 7, 1]
/*
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr)); */
        System.out.println(".....................................................");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 5, 0));
        System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0, 5, 0]

        int size = list.size();

        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        System.out.println(list);//[1, 2, 3, 4, 5]
        int totalNumberOfZero = size - newSize;//5
        System.out.println("totalNumberOfZero = " + totalNumberOfZero);
        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0);
        }
        System.out.println("list = " + list);//list = [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

        System.out.println("..........................................");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 5, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list1) {
            if (each != 0) {
                result.add(each);
            }
        }
        System.out.println("result = " + result);
//result = [1, 2, 3, 4, 5]

        for (Integer each : list1) {
            if (each == 0)
                result.add(each);
        }

        System.out.println("result = " + result);
//result = [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]

        System.out.println("..........................................");

        String str = "ABCD!§5678902@HBHDB!";
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars);
        System.out.println("letters = " + letters);//[A, B, C, D, !, §, 5, 6, 7, 8, 9, 0, 2, @, H, B, H, D, B, !]

        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters = " + letters);//letters = [A, B, C, D, H, B, H, D, B]

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p -> !Character.isDigit(p));

        ArrayList<Character> specialChar = new ArrayList<>(chars);
        //specialChar.removeAll(letters);
        //specialChar.removeAll(digits);
        specialChar.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println("specialChar = " + specialChar);//specialChar = [!, §, @, !]
        System.out.println("digits = " + digits);//digits = [5, 6, 7, 8, 9, 0, 2]


    }
}
