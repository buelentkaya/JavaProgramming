package day27_WrapperClasses;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};  // index=2, element=100

    }



    public static int [] insertElement(int[] arr,int index,int element) {

        if(index<arr.length||index> arr.length){
            System.err.println("INVALID Index"+index);
            System.exit(0);
        }

        int[] insertedArr=new int[arr.length];
        insertedArr[index]=element;

        for (int i = 0,j=0; i < arr.length; j++,i++) {
            if(i==index){
                i++;
            }
            insertedArr[i]=arr[j];

        }
        System.out.println(Arrays.toString(insertedArr));


return  insertedArr;

    }
}
/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};
					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
 */