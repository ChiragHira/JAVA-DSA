package StackDataStructure;

import java.util.Arrays;
import java.util.Stack;

public class Largest_Area_Under_Histrogram {

    public static int getMaxArea(int [] his,int n){
        Stack<Integer>s = new Stack<>();

        int max_Area = 0;
        int tp;
        int area_with_top;

        int i = 0;
        while (i<n){
            // If the current bar is higher than the bar on top of the stack , push them into thr stack
            if (s.empty() || his[i] >= his[s.peek()]){
                s.push(i);
                i++;
            }
            else {
                tp = s.pop();  // PoP and store the top index

                if (s.empty()){
                    area_with_top = his[tp]*i;
                }
                else{
                    area_with_top = his[tp]*(i- s.peek()-1);
                }

                //Update the max area
                if (area_with_top>max_Area)
                    max_Area = area_with_top;
            }
        }

        while (!s.empty()){
            tp = s.pop();  // Pop and store the top index

            if (s.empty()){
                area_with_top = his[tp]*i;
            }
            else{
                area_with_top = his[tp]*(i- s.peek()-1);
            }

            //Update the max area
            if (area_with_top>max_Area)
                max_Area = area_with_top;

        }
            return max_Area;
    }

    public static void main(String[] args) {

        //Approach 1: By Creating the NextSmallest and PreviousSmallest
        int [] His = {6,2,5,4,5,1,6};

        Stack<Integer>stack = new Stack<>();

        //Creating Next Smallest Array
        int [] nextsmallest = new int[His.length];

        stack.push(0);
        for (int i = 1; i< His.length; i++){
            while (!stack.empty() && His[stack.peek()]>His[i]){
                //pop the element
                nextsmallest[stack.pop()]=i;
            }

            stack.push(i);
        }

        while (!stack.empty()){
            nextsmallest[stack.pop()] = His.length;
        }

        //creating previous smallest
        int [] previoussmallest = new int[His.length];
        stack.push(His.length-1);

        for (int i = His.length-2; i>=0; i--){
            while (!stack.empty() && His[stack.peek()]>His[i]){
                //Pop the element
                previoussmallest[stack.pop()]=i;
            }
            stack.push(i);
        }
        while (!stack.empty()){
            previoussmallest[stack.pop()] = -1;
        }

        int [] area = new int[His.length];
        for (int i = 0; i < His.length; i++) {
            area[i] = (nextsmallest[i] - previoussmallest[i] - 1) * His[i];
        }

//        for(int e : previoussmallest){
//            System.out.print(e+" ");
//        }

        Arrays.sort(area);
        System.out.println("The Largest area is "+area[area.length-1]);

        //Approach 2
        //Without using nextSmallest and previousSmallest
        System.out.println("The Largest area is "+getMaxArea(His, His.length));


    }
}
