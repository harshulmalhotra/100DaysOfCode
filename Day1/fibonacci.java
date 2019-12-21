import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("number daal bhai jahan tak series chahie fibo ki");

        int num = scn.nextInt();
        int a=0;
        int b=1;

        for(int i=0; i<num;i++){
            
            System.out.println(a);
            int c =a+b;
            a=b;
            b=c;
            
        }

    }
}