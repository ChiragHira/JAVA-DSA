package StackDataStructure;
import java.util.Stack;

public class Next_Greater{
    public static void main(String[] args) {

        int [] element = {6,8,0,1,3};
        int n = element.length;

        Stack<Integer>s = new Stack<>();
        int [] nxtGreater = new int[n];

        for (int i = n-1; i >=0 ; i--) {
            while (!s.empty() && element[s.peek()] <= element[i]){
                s.pop();
            }

            if (s.empty()) nxtGreater[i]=-1;

            else nxtGreater[i]=element[s.peek()];

            s.push(i);
        }

        for(int e: nxtGreater)
            System.out.print(e+" ");
    }
}
