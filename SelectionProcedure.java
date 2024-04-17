public class SelectionProcedure {
    public static int selectionProcedure(int [] nums , int l, int h,int k){
        int m = QuickSort.partition(nums,l,h);

        //Relation between index number and position number
        if (m==k-1)
            return nums[m];


        //Searching right side of pivot
        else if (m < k-1)
            return selectionProcedure(nums,m+1,h,k);

        //Searching left side if pivot
        else
            return selectionProcedure(nums,l,m-1,k);
    }
    public static void main(String [] args){

        int [] arr = {50,20,40,90,88,11,13};
        int k = 3;
        System.out.println("The "+k+" smallest element in the array is "+selectionProcedure(arr,0, arr.length-1,k));

    }
}
