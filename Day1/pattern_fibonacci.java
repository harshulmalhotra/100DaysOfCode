import java.util.*;

public class pattern_fibonacci{
    public static void main(String[] args){
        int n = 4;
        int a=0;
        int b=1;                                                            // 0          //pattern 
        //                                                                     1 1
        //                                                                     2 3 5
        //                                                                     8 13 21 34
       for(int j = 0 ; j<4 ; j++){   //this loop for changing line
        for(int i=0; i<=j;i++){
            
            System.out.print(a+" ");
            int c =a+b;
             a=b;
            b=c;

    }
    System.out.println("");
        System.out.println("");


       }
}
}