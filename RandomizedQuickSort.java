public class RandomizedQuickSort {
    public static int partition(int [] arr, int low,int high){
        int i = low;

        //Pivot as a random element in the array
        int randomIndex = low + (int) (Math.random()%(low-high+1));
        int temp1 = arr[randomIndex];
        arr[randomIndex] = arr[low];
        arr[low] = temp1;

        int pivot = arr[low];

        for ( int j = low+1; j <= high; j++){

            // j --> To take care of the bigger element than pivot
            // i --> To take care of the smaller element than pivot
            if (arr[j] <= pivot){
                i = i+1;

                //Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Swap arr[i] and arr[low]
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        //Return the correct position of the pivot
        return i;
    }
    public static void quickSort(int [] arr, int low,int high){
        if(low<high){
            //1. Divide the array into sub-problem
            int m = partition(arr,low,high);

            quickSort(arr,low,m-1);
            quickSort(arr,m+1,high);
        }
    }


    public static void main(String[] args){
        int [] nums = {50,20,70,500,10,13,17};
        quickSort(nums,0, nums.length-1);
        MergeSort.print(nums);

    }
}
