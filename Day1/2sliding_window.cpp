//https://www.geeksforgeeks.org/find-subarray-with-given-sum/

#include<bits/stdc++.h>

using namespace std;

int main(){

    ios::sync_with_stdio(0);

    int arr[10] = { 1 ,2, 3, 4 ,5 ,6 ,7 ,8 ,9 ,10 };
    int sum = 15;

    int k = 0;
    int curr_sum = 0;

    for(int i = 0; i < 10 ; i++){
        curr_sum += arr[i];

        if(curr_sum > sum){
            curr_sum -= arr[k];
            ++k;
        }

        if(curr_sum == sum){
            cout << k << " " << i;
        }
        
    }

    return 0;
}