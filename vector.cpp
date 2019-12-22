//only printing the odd numbers.....size of vector will be only the count of odd numbers..not whole input which we gave :)
#include<iostream>
#include<vector>  //something new :) 

using namespace std;

bool isodd(int num){

    if(num%2 == 1){
        return true;

    }
    else{
        return false;
    }

}
  vector<int> check(int n ){          //vector type return hoga res..islie not int ..not void..vector ka functn ki type
    vector<int> res;                 // result variable....which will store all the odd numbers

    for(int i =1 ; i <= n ; i++){
        int num;
        cout << "enter " << i << "th number";
        cin >> num;

        bool flag = isodd(num);
        if (flag == true){
            res.push_back(num);        //push_back is like append in list
        }
    }
    return res;
  }


int main(int argc , char** argv){

    int n ;
    cout << "enter the count of numbers " ;
    cin >> n;

    vector<int> v = check(n);       //return of check functn is res..which is a vector
    
    //display the odd numbers
    for(int i = 0 ; i < v.size() ; i++){       //size is like length function m
        cout << v[i] << endl ; 
    }
    

 }
