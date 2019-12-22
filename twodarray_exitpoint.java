import java.util.*;

public class twodarray_exitpoint{

    public static void main(String[] args){

        int[][] arr = {
            {0,0,1,0},
            {1,1,0,0},
            {0,0,0,0},
            {1,0,1,0}
            };

            int no_r = arr.length; //finding no. of rows
            int no_c = arr[0].length; // finding no. of columns
            int d = 0 ; //direction 

            

            int temp_r = 0; //current row
            int temp_c = 0; //current colm
            
            while(true){
                

                d = ( d + arr[temp_r][temp_c] ) % 4 ;

                if (d == 0){                     //east
                    temp_c++;
                    
                    if(temp_c == arr[0].length){
                        System.out.println(temp_r + " "+ (temp_c - 1) );
                        break;
                    }
                }
                else if(d == 1){  //south
                    temp_r++;   

                    if(temp_r == arr.length){
                        System.out.println((temp_r - 1) + " "+ temp_c );
                        break;

                    }
                }
                else if(d == 2 ){   //west
                    temp_c--;

                    if(temp_c == -1){
                        System.out.println(temp_r + " "+ (temp_c + 1) );
                        break;

                    }
                }
                else if (d == 3){  //north
                    temp_r--;

                    if(temp_r == -1){
                        System.out.println((temp_r + 1) + " "+ temp_c );
                        break;
                    }
                }
                

                

            }
            
    }
}