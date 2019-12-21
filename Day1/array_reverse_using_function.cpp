#include<iostream>

using namespace std;

void swap(int* crr, int left, int right){
    int temp = crr[left];
    crr[left]= crr[right];
    crr[right]= temp;

}
void rev(int* brr, int n ){
    int left = 0;
    int right = n - 1;
        
         while(left < right){
             swap(brr , left , right);
             left++;
             right--;
         }
}
void display( int* drr , int n ){
    for(int i= 0 ; i < n ;i++){
        cout << drr[i] << " ";

    }
    cout << endl;
}

int main(int argc, char** argv ){
    int* arr = new int[6] {10,20,30,40,50,60};
    rev(arr, 6 );
    display(arr, 6);

}