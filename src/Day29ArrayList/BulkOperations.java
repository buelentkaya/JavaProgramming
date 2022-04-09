package Day29ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 7));//list = [1, 2, 3, 3, 4, 5, 6, 7, 7]
        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(3, 5, 7));
        System.out.println("list = " + list);//list = [1, 2, 4, 6]

        System.out.println(".....................................");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300));
        numbers.retainAll(Arrays.asList(100, 200, 300));
        System.out.println("numbers = " + numbers);//[100, 200, 300, 100, 200, 300]

        System.out.println(".....................................");

        ArrayList<String> jobtitle = new ArrayList<>();
        jobtitle.addAll((Arrays.asList("QA", "SDET", "SCRUM MASTER", "BA", "PO", "DEVELOPPER")));
        jobtitle.retainAll(Arrays.asList("SDET", "QA"));
        System.out.println("jobtitle = " + jobtitle);

        System.out.println(".....................................");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll((Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));

        System.out.println("r3 = " + r3);
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        System.out.println(".....................................");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "bulent"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        System.out.println("namesList = " + namesList);

        System.out.println(".....................................");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// Integer oldugundan emin ol

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list2 = " + list2);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer>list3=new ArrayList<>(convertArrayListToArrayList(arr1));

        System.out.println("list3 = " + list3);//list3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]




    }

        public static ArrayList<Integer>  convertArrayListToArrayList(int[] array) {
            ArrayList<Integer> list =new ArrayList<>();

            for(int each:array){
                list.add(each);
            }
            return list;
        }
        
        
        



}
