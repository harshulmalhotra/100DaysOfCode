#include<iostream>

using namespace std;
    int main(int argc, char** argv){

        int n = 7;

        int nstars=1;
        int nspaces = n/2;
        for(int r =1; r<=n; r++)
        {
            for(int i = 1; i <=nspaces; i++){
                cout << "   ";
            }        
            for(int i = 1; i<=nstars; i++)
            {
                cout << " * ";
            }
            for(int i =1; i<=nspaces; i++){
                cout << "   ";    //given 3 spaces
            }
            if(r <= n/2){
                nspaces--;
                nstars +=2;
            }
            else
            {
                nspaces++;
                nstars -= 2;
            }
            cout << endl;
            }
        
    }
