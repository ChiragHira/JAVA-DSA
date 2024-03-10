package SingleDimensionArray;

public class Kadanes {
    public static int KadanesMaxSum(int [] number){
        int currSum = 0;
        int Maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++){
            currSum += number[i];

            if (currSum < 0)
                currSum = 0;

            Maxsum = Math.max(Maxsum,currSum);
        }

        return Maxsum;
    }
    public static void main(String[] args) {
        int[] number = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("The maximum sub is : "+KadanesMaxSum(number));
    }
}
