//Selection Sort
//Time complexity is O(n^2) for all the case
import java.util.Arrays;

public class SelectionSort {

    public static void insertionSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            int min_index = i;
            for (int j = i+1; j <array.length ; j++) {
                if (array[j]<array[min_index]){
                    min_index = j;
                }
            }

            if (min_index!=i){
                //swap of array[mid_index] and array[i]
                int temp = array[min_index];
                array[min_index] = array[i];
                array[i] = temp;

            }
        }
    }

    public static void main(String [] args){
        int [] array = {20,50,12,17,19,25,97,16};
        insertionSort(array);
        System.out.println(Arrays.toString(array));



    }
}
