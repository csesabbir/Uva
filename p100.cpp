#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll len(ll n)
{
    ll cnt=1;
    while(n!=1)
    {
        ++cnt;
        if(n%2!=0)
            n=n*3+1;
        else
            n/=2;

    }
    return cnt;
}
int main()
{
    ll i,j;
    //freopen("input.txt","r",stdin);
    while(cin>>i>>j)
    {
        ll mx=0;
            ll a=min(i,j);
            ll b=max(i,j);
        for(ll k=a;k<=b;k++)
        {
            mx=max(mx,len(k));
        }
        cout<<i<<" "<<j<<" "<<mx<<endl;
    }
    return 0;
}
