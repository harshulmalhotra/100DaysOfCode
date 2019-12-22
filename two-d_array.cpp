#include<iostream>

using namespace std;

int** takeInput(int r, int c){
    int** arr = new int*[r];

    for(int i=0; i<r ; i++){
        arr[i] = new int[c];
        for(int j=0; j<c ; j++){
            cout << "enter the [" << i << ", " << j << "]";

            cin >> arr[i][j];
        }
    }
    return arr;
}

void display(int** arr, int r, int c){
        for(int i = 0 ; i<r ; i++){
            for(int j = 0; j < c ; j++){
                cout << arr[i][j] << " ";
            }
            cout << endl;
        }

}

int main(int argc, char** argv){
    int r ;
    cout << "enter no. of rows";
    cin >> r;

    int c;
    cout << "enter no. of columns";
    cin >> c;
    
    int** arr= takeInput(r,c);
    display(arr, r ,c);

}