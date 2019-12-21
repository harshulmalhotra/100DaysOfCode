import java.util.*;

public class binary_search{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {20, 30 , 120 , 22 , 34 , 41 , 54, 89, 90};
        Arrays.sort(arr);       //for sorting array
        

        int data = 0 ;
        System.out.println(" enter the data to be search");
        data = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left+right)/2;   //this line should be inside the while loop

            if(data > arr[mid]){
                left = mid + 1;

            }
            else if(data < arr[mid]){
                right = mid - 1;

            }
            else{
                System.out.println("found at" + (mid +1) + "th position");
                return;      //to end the loop..otherwise infinite loop!!
                
            }

        }
        System.out.println("not found");

    
    }
}
