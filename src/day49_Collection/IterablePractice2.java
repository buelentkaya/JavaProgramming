package day49_Collection;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {
// here are the emplooyee names

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove all the names "ahmed"

        //the first and the best solution
        names.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println("names = " + names);//names = [John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]


        //the second and the best solution
        List<String> names1 = new ArrayList<>();
        names1.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));


        Iterator<String> it = names1.iterator();

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("ahmed")) {
                it.remove();
            }
        }
        System.out.println("names = " + names);
//names = [John, Ercon, Daniel, Mustafa, Mohammed, Yuliia, Chris]


        System.out.println("--------the third and the best solution-----------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        for (Iterator<String> i = names2.iterator(); i.hasNext(); ) {
            if (i.next().equalsIgnoreCase("ahmed")) {
                i.remove();
            }
        }


        System.out.println(names2);


        System.out.println("-------------------------------------------");


        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 90, 89, 79, 50));

        set.removeIf(p -> p % 2 == 0);
        System.out.println("set = " + set);//set = [1, 3, 5, 7, 9, 79, 89]



        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 90, 89, 79, 50));

        Iterator<Integer> q=set.iterator();

        while(q.hasNext()){

            if(q.next() %2 ==0){
                q.remove();
            }
        }

        System.out.println(set);//set = [1, 3, 5, 7, 9, 79, 89]





    }
}
