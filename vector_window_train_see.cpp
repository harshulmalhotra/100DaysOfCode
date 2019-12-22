#include<vector>
#include<iostream>

using namespace std;

int main(int argc, char** argv){

    vector<int> v {10,20,30,40,50,60,70,80};
    
    int ws = 3; //window's starting posn is 3rd index
    int we = 5 ; //window's ending posn is 5th index

    for(int i = 1 ; i <=v.size(); i++){

        for (int j = ws; j <= we ; j++){
            cout << v[j] << " ";
        }
        cout << endl;

        int val = v.back();
        v.pop_back();
        v.insert(v.begin(), val);
    }
}

//output

// 40 50 60
// 30 40 50
// 20 30 40
// 10 20 30
// 80 10 20
// 70 80 10
// 60 70 80
// 50 60 70