#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;
typedef long long ll;
ll f(ll n)
{
    if(n>=101)
        return (n-10);
    else
        return f(f(n+11));
}
int main()
{
    ll n;
    while(1)
    {
        scanf("%lld",&n);
        if(n==0)
            break;
        printf("f91(%lld) = %lld\n",n,f(n));
    }
    return 0;
}
