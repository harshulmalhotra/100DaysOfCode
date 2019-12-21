//inverse means...swap number with its posn...like ...with a 6-digit no...215634 becomes 341265..at 1st posn is 4..so now 1 will go to 4th posn

#include<iostream>
#include<cmath>

using namespace std;
int main(int argc , char** argv){
    int n;
    cout << "enter a 6-digit no." << endl;
    cin >> n;

    int c = 0 ; //counter
    int rem;
    int t = n; //temp variable
    int res = 0 ;//result

    while(t != 0){
        c = c+1;
        rem = t%10;
        t = t/10;
        res  = res + c * (pow(10.0 , rem - 1));
        
    }
    cout << res <<endl;

}

