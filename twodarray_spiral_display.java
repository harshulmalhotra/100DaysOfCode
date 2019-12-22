import java.util.*;

public class twodarray_spiral_display{
    public static void main(String[] args){
        int[][] arr = {
            
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {41,42,43,44,45}
            
        };

        int mir = 0;  // minimum row
        int mic = 0; // minimum colm

        int mar = arr.length - 1 ; //maximum row
        int mac = arr[0].length-1;  //maximum colm 
        int counter =1;
        int toe = arr.length * arr[0].length;  //total number of elements

        while(counter <= toe){

            //left wall
            for(int i = mir ; i<=mar ; i++){
                System.out.println(arr[i][mic]);
                counter++;
            }
            mic++;        //re-establishing the boundary...ki ab andar vala box print ho //..yh 4 lines k bina kark dekho..problem samajh aaegi.....

            //south wall
            for(int j = mic ; j <= mac ; j++){
                System.out.println(arr[mar][j]);
                counter++;
            }
            mar--;   //re-establishing the boundary...ki ab andar vala box print ho 

            //right wall
            for(int i = mar ; i >= mir ; i--){
                System.out.println(arr[i][mac]);
                counter++;
            }
            mac--;   //re-establishing the boundary...ki ab andar vala box print ho 

            //top wall
            for(int j = mac; j>= mic ; j--){
                System.out.println(arr[mir][j]);
                counter++;
            }
            mir++;  //re-establishing the boundary...ki ab andar vala box print ho 

        }
    



    }
}