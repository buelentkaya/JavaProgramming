package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 55, 44, 55, 66, 11, 22, 3, 1, 2));
        System.out.println(list);//[1, 2, 3, 4, 5, 55, 44, 55, 66, 11, 22, 3]


        for (Integer each : list) {
            int frequency = 0;
            for (Integer element : list) {
                if (element == each) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);//4
                break;
            }
        }


    }
}
