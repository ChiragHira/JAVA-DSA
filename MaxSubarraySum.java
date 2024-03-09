package SingleDimensionArray;

public class MaxSubarraySum {
    public static int MaxSum(int [] number){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;


        //Creating Prefix sum array
        int [] prefixSum = new int[number.length];
        prefixSum[0] = number[0];
        for(int i = 1; i < number.length; i++){
            prefixSum[i] = prefixSum[i-1] + number[i];
        }

        for (int i = 0; i < number.length; i++){
            int start = i;
            for (int j = i; j < number.length; j++){
                int end = j;

                if (start==0)
                    curr = prefixSum[end];
                else
                    curr = prefixSum[end]-prefixSum[start-1];

                if (curr>maxsum)
                    maxsum = curr;
            }
        }

        return maxsum;
    }
    public static void main(String[] args) {
        int[] number = {1,-2,6,-1,3};
        System.out.println("The maximum sub is +"+MaxSum(number));

    }
}
