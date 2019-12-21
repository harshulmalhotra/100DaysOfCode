#include<iostream>
using namespace std;

int main(int argc, char** argv){
	int n ;
    cout << "enter limit";
	cin >> n;
	int a = 0;
	int b = 1;
	int c = 0;
	for(int i =0 ; i<n ; i++){
		 cout << a << "  " ;
		 c = a+ b ;
		 a = b;
		 b = c; 

	}
}
    