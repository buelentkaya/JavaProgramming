package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLIstPractice1 {
    public static void main(String[] args) {
        /*

         */

        String []countries= {"Japan","Korea","United States","Turkey","United KIngdom","Canada"};
      //converting array to arrayLIst
        ArrayList<String> list =new ArrayList<>(Arrays.asList(countries));


        list.removeIf(p-> p.length()>=10);
        System.out.println(list);//[Japan, Korea, Turkey, Canada]

//converting arraylist to array
        countries=list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries) );//[Japan, Korea, Turkey, Canada]




    }
}
