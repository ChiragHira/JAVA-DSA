package Permutation;

import Permutation.Permutation_1;
import java.util.LinkedHashSet;


public class PermutationWithDuplicate {

    public static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void permute(String str,int l,int r){
        //Base Case
        if (l==r){
            set.add(str);
            return;
        }

        for (int i = l; i < str.length(); i++){

            str = Permutation_1.swap(str,l,i);
            permute(str,l+1,r);
            str = Permutation_1.swap(str,l,i);

        }

    }
    public static void main(String[] args) {
        String s = "ABAB";
        permute(s,0,3);
        System.out.println(set);
    }
}
