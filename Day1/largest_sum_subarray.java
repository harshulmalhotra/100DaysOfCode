//KADANE's ALGORITHM

import java.util.*;

public class largest_sum_subarray{

    public static void main(String[] args){
    int[] arr = {2,4,3,-6,-4,1,7,-2,6,4,-3,2,3,-9,-6,-4,4,8};

    int ci = 0 ;                //jo initial p rhega..  //in starting, always define variables..and put value 0 in them.
    int cj = 0;                   //jo aage increment hta rhta h
    int cs = arr[0];

    int bi= 0 ;  //best ith or starting posn
    int bj = 0; //best jth or ending posn
    int bs = arr[0];   // best sum of subarray

    for(int i = 1; i < arr.length; i++){
        if(cs > 0){                   // agar vo already +ve hai...toh usi m add krdo...bas ending posn ko update krdo...starting ko nahi
            cj++ ; 
            cs = cs+arr[i];
        }
        else{
            ci = i;               // agar sum -ve aarha hai..toh starting position ko update kro..and ek new subarray shuru karo 
            cj = i ;
            cs = arr[i];
        }
        if(cs > bs)
        {
            bi = ci;
            bj = cj;
            bs = cs;
        }

        for(int u = bi; u <= bj; u++){
            System.out.print(arr[u] + " ");

        }
        System.out.println();

    }

}
}