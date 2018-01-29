#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    scanf("%d",&test);
    for(int i=1;i<=test;i++)
    {
        int l,w,h;
        scanf("%d%d%d",&l,&w,&h);
        if(l<=20&& w<=20&&h<=20)
            cout<<"Case "<<i<<": "<<"good"<<endl;
        else
            cout<<"Case "<<i<<": "<<"bad"<<endl;
    }
    return 0;
}
