package day51_MAP;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        //Student  name

        Map<String, Integer> students=new HashMap<>();
        students.put("Kerem",95);
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);
        //{Kerem=95, Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=95}

        System.out.println(students.size());//  8

//display the score of Alex

        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));//students.get("Alex") = 96

        // replace Ali' score to 90

        students.replace("Ali", 90 );

        System.out.println(students);

        students.remove("Alex");

        System.out.println(students);//{Kerem=95, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}
        System.out.println(students.size());//  7

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);



        boolean r3 = students.containsValue(97);

        System.out.println(r3);


        System.out.println(students.isEmpty());


        System.out.println("-----------equals()-;-------------");

       Map<String,Integer> map1=new HashMap<>();
       map1.putAll(students);
       Map<String,Integer> map2=new HashMap<>();
       map2.putAll(students);

        System.out.println( map1 == map2); //falsa
        System.out.println(map1.equals(map2));//true

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);




    }
}
