import java.util.ArrayList;

public class Container_With_MaximumWater {
    public static int MaxWater(ArrayList<Integer>Height){
        int left = 0;
        int right = Height.size() - 1;
        int maxArea = 0;

        while(left<right){
            int ht = Math.min(Height.get(left), Height.get(right));
            int width = right - left;
            int currArea = ht*width;
            maxArea = Math.max(maxArea,currArea);

            if (Height.get(left)<=Height.get(right))
                left++;
            else
                right--;
        }

        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.print(MaxWater(height));
    }
}
