#include<iostream>


using namespace std;

int main(int argc, char** argv){
    
    int num;
    cout <<"enter" << endl;
    cin >> num;
    
    

   cout << endl << endl;


    int rem , r = 0;

    int n = num;
        
       while(n!=0){ 
                                                                                  
    
        rem=n%10;
                        cout <<rem <<"." <<endl;

        n=n/10;
                        cout << n <<".." <<endl;

        r = r*10 + rem;
    }
    cout << r << "  is the reversed number" << endl;
}

