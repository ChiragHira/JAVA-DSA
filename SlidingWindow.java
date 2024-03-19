package Dqueue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    public static void getMax(int [] nums,int n,int k){
        Deque<Integer> q = new LinkedList<>();
        int i;


        for(i = 0; i < k; i++){
            while (!q.isEmpty() && nums[i]>= nums[q.peekLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }

        //For rest of the element i.e from k to n-1
        for(;i < n; i++){
            System.out.print(nums[q.peek()]+ " ");

            // Check if the element is out of window or not
            while (!q.isEmpty() && q.peek() <= i-k)
                q.removeFirst();

        
            while (!q.isEmpty() && nums[i]>=nums[q.peekLast()])
                q.removeLast();

            // Add the current element to the rear of q1
            q.addLast(i);
        }

        System.out.print(nums[q.peek()]);

    }

    public static void main(String[] args) {
        int [] nums = {4,-2};
        getMax(nums,2,2);
    }
}
