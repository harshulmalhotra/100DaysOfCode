import java.util.*;

public class bars
{

    public static void main(String[] args)
    { 
        int[] arr = {4, 7, 2, 8, 5};

        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        for(int floor = max; floor >= 1; floor--)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] >= floor)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}







