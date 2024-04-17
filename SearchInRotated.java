

public class SearchInRotated {

    public static int binSearch(int [] array,int low,int high,int key){
        while(low<=high){

            int mid = low + (high-low)/2;

            if (array[mid]==key){
                return mid;
            }
            else if (array[mid]<key) {
                low = mid+1;
            }

            else {
                high = mid-1;
            }
        }

        return -1;
    }
    public static int findPivot(int [] nums, int low , int high){
        if(low<=high){
            int mid = low + (high - low)/2;

            if (nums[mid]>nums[mid+1])
                return mid;

            else if (nums[mid - 1] > nums[mid]) {
                return mid - 1;
            }

            else if (nums[low]>nums[mid]) {
                return findPivot(nums,low,mid-1);
            }

            else {
                return findPivot(nums,mid+1,high);
            }
        }

        return -1;
    }

    public static int search(int [] nums , int low, int high,int target){
        int pivot = findPivot(nums,low,high);

        if(pivot==-1)
            return binSearch(nums,low,high,target);

        else if (target>nums[low]) {
            return binSearch(nums,low,pivot-1,target);
        }

        else
            return binSearch(nums,pivot+1,high,target);
    }

    public static void main(String[] args){

        int [] array={5,6,7,8,9,10,1,2,3};
        int target = 3;
        System.out.println(search(array,0, array.length-1,target));
    }
}
