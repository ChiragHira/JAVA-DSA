package StackDataStructure;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String str){
        char [] chars = str.toCharArray();

        Stack<Character>stack1 = new Stack<>();

        for(char e : chars){
            if (e=='[' || e=='{' || e=='('){
                stack1.push(e);
                continue;

            } else if (stack1.empty()) {
                return false;
            }
            char temp = stack1.pop();
            if (temp == '[' &&  e!= ']')
                return false;


            else if (temp=='{' && e!='}') {
                return false;
            }
            else if (temp=='(' && e!=')') {
                return false;
            }
        }

        return (stack1.empty());
    }

    public static void main(String[] args) {
        String s = "({}[])";
        ValidParenthesis vp = new ValidParenthesis();

        System.out.println("The given string is valid :"+vp.isValid(s));
    }
}
