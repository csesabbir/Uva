#include<iostream>
using namespace std;
int main()
{
    double f,sum=0.0;
    for(int i=0;i<12;i++)
    {
        cin>>f;
        sum+=f;
    }
    cout<<"$"<<(sum/12)<<endl;
    return 0;
}
