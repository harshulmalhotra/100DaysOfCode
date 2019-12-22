//printing only numebrs greater than 50       //see notes

#include<iostream>
#include<vector>

using namespace std;

void filter(vector<int> & v)
{
    for(int i = v.size() - 1; i >= 0; i--)
    {
        if(v[i] > 50)
        {
            v.erase(v.begin() + i);
        }
    }

    for(int i =0 ; i<v.size(); i++)
    {
        cout << " " << v[i];
    }

    cout << endl;
}

int main(int argc, char** argv)
{
    vector<int> v {25,1, 2, 29, 6, 78, 11, 68, 14, 13};
    filter(v);
    for(int i = 0; i < v.size(); i++)
    {
        cout << " " << v[i];
    }

    cout << endl;
}