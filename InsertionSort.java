//Insertion  Sort
//Time complexity is O(n^2) for worst case and O(n) for best case
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int j =i;
            while (j>0 && array[j]<array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String []args){
        int [] array = {15,12,69,9,63,25,78 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
