import java.util.*;

public class twodarray_rotate {
    public static void main(String[] args){

        int[][] arr = {

                {11,12,13,14,15},
                {21,22,23,24,25},
                {31,32,33,34,35},
                {41,42,43,44,45},
                {51,52,53,54,55}

        };
        
        //for transporse 
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr[0].length ; j++){     // logic in copy..why started with i...not 0
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        
        //reverse each row 
        for(int i = 0; i < arr.length; i++){
            int l = 0; //left
            int r = arr[0].length - 1;  //right

            while(l < r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;

            }
        }

        //display
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}