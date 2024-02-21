public class balanceParenthesis {

    public static void generateParenthesis(int n, int oc,int cc,String ans){
        if (oc==n && cc==n){
            System.out.println(ans);
            return;
        }
        if (oc<n){
            generateParenthesis(n,oc+1,cc,ans+"(");
        }
        if (oc>cc){
            generateParenthesis(n,oc,cc+1,ans+")");
        }
    }
    public static void main(String[] args){

        generateParenthesis(4,0,0,"");
    }
}
