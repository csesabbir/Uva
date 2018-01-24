#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main()
{
    int t;
    //freopen("input.txt","r",stdin);
    scanf("%d",&t);
    scanf("%*d");
    ll sum=0;
    for(int i=1;i<=t;i++)
    {
        string str;
        ll k;
        cin>>str;
        if(str=="donate")
        {cin>>k;sum+=k;}
        if(str=="report")
        {
            cout<<sum<<endl;
        }
    }
    return 0;
}
