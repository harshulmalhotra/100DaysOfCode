#include<bits/stdc++.h>

//https://www.geeksforgeeks.org/equilibrium-index-of-an-array/

using namespace std;

int main(){

    int n =5;
   int arr[n] = {1,3,3,2,2};

   int l =0;
   int r = n-1;
   int s1 =0;
   int s2 =0 ;

   while(l < r){
       s1 += arr[l];
       s2 += arr[r];

       if(s1 == s2){
           cout << (l+1) ;
       }

        ++l; --r;

   }

    return 0;
}