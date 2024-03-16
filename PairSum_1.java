import java.util.ArrayList;

public class PairSum_1 {
    //Two Pointer Approach
    //Time complexity = O(n)
    //Space complexity = O(1)
    public static int[] pairSum1(ArrayList<Integer>number,int target){
        int left = 0;
        int right = number.size() - 1;
        int [] result = new int[2];

        while (left<right){
            if (number.get(left)+number.get(right)==target) {
                result[0] = number.get(left);
                result[1] = number.get(right);
                break;
            }
            else if (number.get(left)+number.get(right)>target)
                right--;
            else
                left++;
        }
        return result;
    }

    //Brute force
    // Time Complexity = O(n^2)
    // Space Complexity = O(1)

    public static int[] BruteForce(ArrayList<Integer>number,int target){
        int [] result = new int[2];
        for (int i = 0; i < number.size(); i++){
            for (int j = i+1; j < number.size(); j++){
                if (number.get(i)+number.get(j)==target)
                {
                    result[0] = number.get(i);
                    result[1] = number.get(j);
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
         ArrayList<Integer>number = new ArrayList<>();
         number.add(2);
         number.add(7);
         number.add(11);
         number.add(15);

//         int []answer = pairSum1(number,18);
//
//         for (int e : answer){
//             System.out.print(e+" ");
//         }

        int []answer1 = BruteForce(number,18);

        for (int e : answer1){
            System.out.print(e+" ");
        }
    }
}
