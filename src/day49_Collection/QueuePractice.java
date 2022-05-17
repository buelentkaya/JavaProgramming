package day49_Collection;



import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQuese = new PriorityQueue<>();
        priorityQuese.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("priorityQuese = " + priorityQuese);
        //priorityQuese = [10, 40, 300, 200, 90]


        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("arrayDeque = " + arrayDeque);
        // arrayDeque = [10, 200, 300, 40, 90]


        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("linkedList = " + linkedList);
        //linkedList = [10, 200, 300, 40, 90]
        System.out.println("-------------------------------------------------");


        priorityQuese.poll();
        System.out.println("priorityQuese = " + priorityQuese);
        //priorityQuese = [40, 90, 300, 200]

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);
//arrayDeque = [200, 300, 40, 90]

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);
//linkedList = [200, 300, 40, 90]
        System.out.println("--------------how to get index number-----------------------------------");


        // System.out.println(priorityQueue.get(1));
        //  System.out.println(arrayDeque.get(1));

        //   System.out.println( ( (List)linkedList ).get(1) );

        System.out.println(((LinkedList<Integer>) linkedList).get(1));// 300


        System.out.println("--------------what is poll()?------pop() ==>> LIFO----------------------------");
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println("chars"+chars);//chars[A, B, C, D]

        ( (Stack)chars ).pop();// pop methodu en son olani atti
        System.out.println("chars"+chars);//chars[A, B, C]


        List<String> names=new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

       ((LinkedList<String>) names).poll();

        System.out.println(names);//[Jimmy, Kathy, Breanna, Max]

        ((LinkedList<String>) names).poll();

        System.out.println(names);//[Kathy, Breanna, Max]

        ((LinkedList<String>) names).poll();

        System.out.println(names);//[Breanna, Max]
    }
}
