import java.util.*;

public class array_reverse_using_function{

    public static void main(String[] args){

        int[] arr = {10 , 20 , 30 , 40 , 50 , 60};            
        rev(arr);
        disp(arr);
        
        }

        // public static void swap(int a,int b){           //will don't print reverse array.
        //     int temp = a;
        //     a = b;                                                //will call by swap(left,right)
        //     b = temp;
        // }                                  //the swap functn will not approach the array at heap at 4k. SEE NOTES!
                                              //and stack me hi aapas me variable m chng hjaega..or output milega same 123456.


        public static void swap(int[] arr, int left, int right){ // this time swap functn will apporach the array at heap at 4k.
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        public static void rev(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int temp = 0;

        while(left < right){
            swap(arr , left ,right);

            left++;
            right--;
        }

        }
        public static void disp(int[] arr){
        for(int i =0; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        } 

}