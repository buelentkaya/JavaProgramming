package day49_Collection;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {


        Set<Integer>hashSet=new HashSet<>();
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("hashSet = " + hashSet); //hashSet = [200, 40, 10, 90, 300]  order is random
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null, null, null));
        System.out.println("---------------------------");
        System.out.println("hashSet = " + hashSet);//hashSet = [200, 40, 10, 90, 300] dublicates not allowed

        System.out.println("---------------------------");

        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);//list = [10, 200, 300, 40, 90]   order is preserved
        System.out.println("---------------------------");
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);// duplicates aloved
//list = [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]
        System.out.println("list.get(4) = " + list.get(4));//90

        //hashSet.get(4);  hasscode


        Set<Integer> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);//linkedHashSet = [10, 200, 300, 40, 90, null] keeps order

        Set<Integer>treeSet=new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //  treeSet.addAll(Arrays.asList(null,null,null));


        System.out.println("treeSet = " + treeSet);//treeSet = [10, 40, 90, 200, 300]   ascending order
        // no null keyword
        //no dublications
    }
}
