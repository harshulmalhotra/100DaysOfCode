#include<iostream>
#include<vector>
#include<algorithm>            //for sort function

using namespace std;

int main(int argc , char** argv){
    vector<int> v1 {1,1,2,2,2,3,5};
    vector<int> v2 {1,1,1,2,2,4,5};

    sort(v1.begin(), v1.end());
    sort(v2.begin(), v2.end());

    int i = 0 ; 
    int j = 0 ;

    vector<int> v3;

    while(i<v1.size() && j<v2.size()){

        if(v1[i]==v2[j]){
            v3.push_back(v1[i]);
            i++;
            j++;
        }
        else if(v1[i]>v2[j]){
            j++;
        }
        else{
            i++;
        }
        
    }
    for(int i = 0 ; i < v3.size(); i++){
            cout << " " << v3[i];
        }

}