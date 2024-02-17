import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

    public static void combinationsum(int[] nums, List<List<Integer>>result, List<Integer>temp, int target, int start){
        //Base Case condition
        if (target<0) return;

        else if (target == 0) {
            result.add(new ArrayList<>(temp));
        }

        for (int i = start ;i < nums.length;i++){
            temp.add(nums[i]);
            combinationsum(nums,result,temp,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>>ans = new ArrayList<>();
        combinationsum(candidates,ans,new ArrayList<>(),target,0);

        System.out.println(ans);
    }
}
