package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees=new ArrayList<>();
    employees.addAll(Arrays.asList("Omer","Bera","Kerem","Tarik","Ata","daniel","Ahmed","Ali"));

    employees.retainAll(Arrays.asList("Tarik","Kerem","Omer"));
        System.out.println("employees = " + employees);//employees = [Omer, Kerem, Tarik]

        System.out.println("...................................................");
        String[] names={"Omer","Bera","Kerem","Tarik","Ata","daniel","Ahmed","Ali"};

        ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.charAt(0)=='A');

        System.out.println("list = " + list);
//list = [Omer, Bera, Kerem, Tarik, daniel]

        names=list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));//[Omer, Bera, Kerem, Tarik, daniel]















    
    }
}
