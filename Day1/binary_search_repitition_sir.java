import java.util.*;

public class binary_search_repitition_sir{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {10,10,10,20,20,20,30,30,40,50,50,50};

        int data = 0 ;
        System.out.println(" enter the data to be search");
        data = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while(left <= right){
            int mid = (left+right)/2;   //this line should be inside the while loop
            

            if(data > arr[mid]){
                left = mid + 1;

            }
            else if(data < arr[mid]){
                
                right = mid - 1;

            }
            else{
                result = mid;
                right = mid - 1 ; // for first occurance
                // left = mid  + 1; // for last occurance
                
                
            }

        }
        if (result == -1){
        System.out.println("not found");}
        else{
            System.out.println("first occurance found at" + result + " th position" );
        }

    
    }
}
