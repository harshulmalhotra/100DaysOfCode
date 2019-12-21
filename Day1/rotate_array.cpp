#include<iostream>
 
using namespace std;

void swap(int* a,  int* b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void reverse(int* arr, int l , int r){                  //l-left, r-right
    while(l<r)
    {
        swap(&arr[l] , &arr[r]);
        l++;
        r--;

    }

}    
void rotate(int* arr, int n ,int k){
    k = k% n ;       //if k is greater than n...
    
    k = k<0? n+k:k ; // if k is negative....
                     // the above 2 lines are for special cases..if trick question comes
    
    //implementing algorithm 
    
    //P1 -> P1'                
    reverse(arr , 0 , n-k-1);     //n-> length of array

    //P2 -> P2'
    reverse(arr,  n-k , n-1);   //k-> no. of rotations

    //(P1' + P2')' -> P2 P1
    reverse(arr , 0 , n-1);
}

void display(int* arr ,  int n ){
    for(int i=0 ; i<n ; i++){
        cout << arr[i] << " ";
    }
    cout << endl; 
}
int main(int argc, char** argv){
    int* arr = new int[7] {2,9,8,1,3,5,4};     

    rotate(arr,7,3);        //array of lenth 7...and rotating it 3 times
    display(arr, 7);

    rotate(arr,7,17);        //array of lenth 7...and rotating it 17 or 3 times
    display(arr, 7);

    rotate(arr,7,-51);        //array of lenth 7...and rotating it -51 or 2 times
    display(arr, 7);
}