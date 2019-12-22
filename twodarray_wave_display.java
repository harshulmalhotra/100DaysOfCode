import java.util.*;

public class twodarray_wave_display{
    public static void main(String[] args){
        int[][] arr = {
            
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35}
            
        };
        
        
        
        
        for( int j = 0; j < arr[0].length; j++){       //trick...we are printing the colms...in top to bottom and then..bottom to top approach and then..
            if(j % 2 == 0){       //if colm index is even
                //top to bottom printing
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            }
            else     //if colm index is odd
            {
                //bottom to top printing
                for( int i = arr.length - 1; i >=0; i--){   //starting with bottom 
                System.out.println(arr[i][j]);
            }}
        }
    }
}