#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;
typedef long long ll;
ll digit(ll num)
{
    num/=10;
    return num%10;
}
int main()
{
    int test;
    scanf("%d",&test);
    for(int i=0;i<test;i++)
    {
        ll number;
        cin>>number;
        number *=567;
        number/=9;
        number+=7492;
        number *=235;
        number/=47;
        number-=498;
        cout<<abs(digit(number))<<endl;

    }
    return 0;
}
