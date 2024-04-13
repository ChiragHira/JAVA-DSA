public class MergeSort {

    public static void merge(int [] arr, int start,int mid,int end){
        int i,j,k;

        int n1 = (mid - start) + 1;
        int n2 = end-mid;

        //Create the left and right sub-array
        int [] left = new int[n1];
        int [] right = new int[n2];

        //Copy the data into left and right sub-array
        for (i = 0; i < n1; i++){
            left[i] = arr[start+i];
        }
        for (j = 0; j < n2; j++){
            right[j] = arr[mid+1+j];
        }

        i=0;
        j=0;
        k=start;

        //Comparison between the element  of left and  right sub-array
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                arr[k]=left[i];
                i++;

            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        //Copy the remaining element
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }

    public static void print(int[] arr){
        System.out.print("[ ");
        for (int e : arr){
            System.out.print(e+" ");
        }
        System.out.print(" ]");
    }
    public static void mergeSort(int [] arr , int i , int j){
        if(i<j){
            //1. Divide the array into two sub-problem
            int mid = i + (j - i)/2;
            //2. Conquer the sub problem
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);

            //3.Combine all the solution
            merge(arr,i,mid,j);
        }
    }

    public static void main(String[] args ){
        int [] nums = {50,20,40,90,88,11,13};
        int n = nums.length;
        mergeSort(nums,0,n-1);
        print(nums);

    }
}
