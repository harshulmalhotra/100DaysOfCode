// gcd...greatest common divisor
#include<iostream>

using namespace std;       //HCF...highest common factor.....GCD...greatest common divisor!

int main(int argc, char** argv){
    int a = 21;
    int b = 14;

    while(b%a !=0){
        int rem = b % a;
        b=a;
        a=rem;
    }
    cout << a << endl;



}

