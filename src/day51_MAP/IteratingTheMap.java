package day51_MAP;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 99);
        students.put("Serkan", 70);
        students.put("Andriy", 98);


        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : students.keySet()) {
            Integer value = students.get(key);// you can get the value of the index
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
//earlyBirds = {Andriy=98, Aygun=95, Maria=90, Ozan=99}
        System.out.println("angryBirds = " + angryBirds);
//angryBirds = {Alex=80, Serkan=70, Ali=85}
        System.out.println("--------------------------------------------------------");
        Set<String> keys = students.keySet();


        System.out.println("--------------------------------------------------------");

        // Collection<Integer> scores = students.values();

        List<Integer> scores = new ArrayList<>(students.values());
        System.out.println("scores = " + scores);
//scores = [80, 98, 95, 90, 99, 70, 85]
        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("--------------------------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        System.out.println("minScore = " + minScore);
        System.out.println("maxScore = " + maxScore);
//minScore = 70
//maxScore = 99
        System.out.println("--------------------------------------------------------");

        System.out.println("Collections.max(students.values()) = " + Collections.max(students.values()));
        System.out.println("Collections.min(students.values()) = " + Collections.min(students.values()));
        //Collections.max(students.values()) = 99
        //Collections.min(students.values()) = 70


       /* for (String eachKey : keys) {
            System.out.println(eachKey + " : " + students.get(eachKey));
            //Alex : 80
            //Andriy : 98
            //Aygun : 95
            //Maria : 90
            //Ozan : 99
            //Serkan : 70
            //Ali : 85

            students.replace(eachKey, students.get(eachKey) + 5);

        }
        System.out.println(students);
//{Alex=85, Andriy=103, Aygun=100, Maria=95, Ozan=104, Serkan=75, Ali=90}  add 5 to each of the value

*/

        System.out.println("--------------------------------------------------------");

        // how many students has the score of 95 or greater
        int count=0;

        for(Integer eachScore: students.values()){
            if(eachScore>=95){
                count++;
            }
        }

        System.out.println("count = " + count);//3


        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            //Alex=80
            //Andriy=98
            //Aygun=95
            //Maria=90
            //Ozan=99
            //Serkan=70
            //Ali=85
            System.out.println(entry.getKey() +" : " +entry.getValue());  //we can reach both
            // key   value
            //Alex : 80
            //Andriy : 98
            //Aygun : 95
            //Maria : 90
            //Ozan : 99
            //Serkan : 70
            //Ali : 85
        }


        }




    }


