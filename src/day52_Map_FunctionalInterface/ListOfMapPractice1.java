package day52_Map_FunctionalInterface;

import java.util.*;

public class ListOfMapPractice1 {
    public static void main(String[] args) {

        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        Map<String, String> scrumTeam2 = new LinkedHashMap<>();
        scrumTeam2.put("Anton", "SDET");
        scrumTeam2.put("Muhammed", "Developer");
        scrumTeam2.put("Gulistan", "Developer");
        scrumTeam2.put("Ahmad", "PO");
        scrumTeam2.put("Nevim", "SM");
        scrumTeam2.put("Atakan", "SDET");

        Map<String, String> scrumTeam3 = new LinkedHashMap<>();
        scrumTeam3.put("YanChun", "BA");
        scrumTeam3.put("Tahir", "Developer");
        scrumTeam3.put("Urantuya", "SM");
        scrumTeam3.put("Veronica", "Developer");
        scrumTeam3.put("Alex", "Developer");
        scrumTeam3.put("Abdulaziz", "Developer");

        Map<String, String> scrumTeam4 = new LinkedHashMap<>();
        scrumTeam4.put("Alim", "PO");
        scrumTeam4.put("Kaiser", "SDET");
        scrumTeam4.put("Alinur", "SDET");
        scrumTeam4.put("Farya", "Develepor");
        scrumTeam4.put("Sherzod", "Developer");
        scrumTeam4.put("Gulsen", "SM");
        scrumTeam4.put("David", "Sdet");

        Map<String, String> scrumTeam5 = new LinkedHashMap<>();
        scrumTeam5.put("Elza", "SDET");
        scrumTeam5.put("Mehmet", "Developer");
        scrumTeam5.put("Stefan", "Developer");
        scrumTeam5.put("Rishat", "PO");
        scrumTeam5.put("Ismail", "SM");
        scrumTeam5.put("Tamara", "SDET");
        scrumTeam5.put("Adnan", "QA");

        //  LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();

        //    1.1 Create a data structure that can contain all the given maps above

        //  List<LinkedHashMap<String,String>> scrumTeams= new ArrayList<>();
        //  scrumTeams.add(scrumTeam1);  //it may accur proble but if we change linkedhaspam with MAp

        List<Map<String, String>> scrumTeams = new ArrayList<>();
        scrumTeams.add(scrumTeam1);// as you see there will be no problemes
        scrumTeams.add(scrumTeam2);
        scrumTeams.addAll(Arrays.asList(scrumTeam3, scrumTeam4, scrumTeam5));

        System.out.println("scrumTeams = " + scrumTeams);
        //scrumTeams =
        // [{Abdulhamid=SM, Nikita=Developer, Alina=Developer, Mert=PO, Lee=SDET},
        // {Anton=SDET, Muhammed=Developer, Gulistan=Developer, Ahmad=PO, Nevim=SM, Atakan=SDET},
        // {YanChun=BA, Tahir=Developer, Urantuya=SM, Veronica=Developer, Alex=Developer, Abdulaziz=Developer},
        // {Alim=PO, Kaiser=SDET, Alinur=SDET, Farya=Develepor, Sherzod=Developer, Gulsen=SM, David=Sdet},
        // {Elza=SDET, Mehmet=Developer, Stefan=Developer, Rishat=PO, Ismail=SM, Tamara=SDET, Adnan=QA}]

        System.out.println("scrumTeams.size() = " + scrumTeams.size());//5

        //  1.2 Print the names of all scrum masters
        for (Map<String, String> eachTeam : scrumTeams) {

            for (Map.Entry<String, String> entry : eachTeam.entrySet()) {

                System.out.println(entry.getKey() + entry.getValue());
            }
        }
        System.out.println("------------SDETS--------------------------------------");

        //  1.2 Print the names of all scrum masters

        for (Map<String, String> eachTeam : scrumTeams) {

            for (Map.Entry<String, String> entry : eachTeam.entrySet()) {

                if (entry.getValue().equals("SDET")) {
                    System.out.println(entry.getKey());
                }
            }
        }


        System.out.println("-------------------scrum masters------------------------------------------");

        //  1.2 Print the names of all scrum masters

        for (Map<String, String> eachScrumTeam : scrumTeams) {

            /*
            for (String name : eachScrumTeam.keySet()) {
                if(eachScrumTeam.get(name).equals("SM") ){
                    System.out.println(name);
                }
            }
             */
            for (Map.Entry<String, String> pair : eachScrumTeam.entrySet()) {
                if (pair.getValue().equals("SM")) {
                    System.out.println(pair.getKey());
                }


            }
        }

            System.out.println("-------------------Developers-----------------------------------------");
            //    1.3 Print the names of all Developers


        for (Map<String, String> eachTeam : scrumTeams) {

            for (Map.Entry<String, String> entry : eachTeam.entrySet()) {

                if (entry.getValue().equals("Developer")) {
                    System.out.println(entry.getKey());
                }
            }
        }



        }
    }




