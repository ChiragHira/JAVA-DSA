//Bubble Sort
//Time complexity is O(n^2) for worst case and O(n) for best case

import java.util.Arrays;

public class bubbleSort {

    static int xchange = 0; // Track the number of comparison in array

    public static void bubSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            //for every iteration,we get the biggest element at the end of array
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;

                    swap = true;
                    xchange++;
                }
            }

            if(!swap){
                break;
            }
        }
    }
    public static void main (String []args){
        int [] array = {20,50,10,40,100,90};
        bubSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Number of comparison are : "+xchange);
    }
}
