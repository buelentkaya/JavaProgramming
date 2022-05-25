package day51_MAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {
    public static void main(String[] args) {
     /*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

        Map<Integer, String[]> groups=new TreeMap<>();
        groups.put(1,group1);

        System.out.println(Arrays.toString( groups.get(1) )  );



*/


        ArrayList<String> group5=new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"));
        ArrayList<String> group1=new ArrayList<>(Arrays.asList("Duygu","Magda","Farangez","Edison","Kerem","Farangis"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));


        Map<Integer,ArrayList<String>> groups=new TreeMap<>();

      //    pair:  Id and  names of Students
        groups.put(1,group1);
        groups.put(3,group5);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(2,group2);

        System.out.println(groups);
       //{1=[Duygu, Magda, Farangez, Edison, Kerem, Farangis],
        // 2=[Margie, Vesele, Iryn, Nilufar, Aziza, Nurcan, Raika, Igor, Elif, Sana, Azamat],
        // 3=[Nazar, Veronika, Mikael, Layla, Badmaa, Zaeir, Anna, Tamara, Eugene],
        // 9=[Alex, Ali, Andriy, Cassandra, Sevgul, Olha, Tito, Ozan, Serkan, Furkan, Madina, Muharrem],
        // 24=[Maria, Kristina, Amin, George, Layan, Amin, Yulia, George, Ayanle, Maxim, Nermin, Doughlas]}


        // in order to get the names of the students from eac group

        for (String eachStudent : groups.get(9)) {
            System.out.println("eachStudent = " + eachStudent);

            //eachStudent = Alex
            //eachStudent = Ali
            //eachStudent = Andriy
            //eachStudent = Cassandra
            //eachStudent = Sevgul
            //eachStudent = Olha
            //eachStudent = Tito
            //eachStudent = Ozan
            //eachStudent = Serkan
            //eachStudent = Furkan
            //eachStudent = Madina
            //eachStudent = Muharrem
        }


        System.out.println(groups.get(2).get(1));  //   Vesele
        // groups.get(2)   by writing this we can get the arraylist of 2 now,
        //As you konw that from collections type, we can get method to get the element of arraylis so...

        System.out.println("------------------------------------------------");

        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachStudents : eachGroup) {
                System.out.println(eachStudents);
            }
        }







    }
}
