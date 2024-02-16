import java.util.*;

public class sqrt {

    public static int SquareRoot(int n){

        int low = 0;
        int high = n/2;
        int result= -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            long val = (long) mid * mid;

            if (val==n){
                //perfect square
                return mid;
            }

            else if (val>n){
                
                high = mid-1;
            }

            else {
                //Store the floor value in case if number is not perfect square
                result = mid;
                low = mid + 1;
            }
        }

        return result;
    }
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = SquareRoot(n);
        System.out.println(result);

    }
}
