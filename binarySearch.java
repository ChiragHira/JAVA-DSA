import java.util.*;


public class binarySearch {

    public static int binSearch(int [] array,int key){
        int low = 0;
        int high = array.length-1;

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

    public static void main(String [] args){
        System.out.println("Enter the number of element :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Enter the element of Array");

        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the key :");
        int key = scan.nextInt();

        int result = binSearch(array,key);

        if (result ==-1){
            System.out.println("Element in not found");
        }

        else {
            System.out.println("Element is found at index "+result);
        }
    }
}
