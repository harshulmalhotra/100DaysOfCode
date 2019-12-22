import java.util.*;

public class twodarray_matrix_multiplicationl{
    public static void main(String[] args){
        int[][] m1={
            {10 ,1 ,0},
            {1, 0, 1},
        };
        
        int[][] m2 = {
                {2,1,0,1},
                {1,1,0,0},
                {0,1,0,1}
        };

        int r1 = m1.length;
        int c1 = m1[0].length;
        int r2 = m2.length;
        int c2 = m2[0].length;

        if(c1 != r2){                                     //condition
            System.out.println("cant be multiplied");
            return;

        }

        int[][] prd = new int[r1][c2]; //the product matrix...which comes after multiplication

        for(int i = 0 ; i < prd.length ; i++){
            for(int j = 0; j < prd[0].length ; j++){
                for(int k = 0 ; k < r1 ; k++){               //for our help ...jo vary krti h chiz...row m2 m ..and colm m1 m...
                    prd[i][j] += m1[i][k] * m2[k][j];      // m1 ki row fix rhti hai and colm vary krta h...and vice-versa
                }
            }
        }

        //display
        for(int i = 0 ; i < prd.length ; i++){
            for(int j = 0; j < prd[0].length ; j++){
            System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}