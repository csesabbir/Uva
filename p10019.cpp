#include<bits/stdc++.h>
using namespace std;
int binary(int num)
{
    int cnt=0;
    int r=0;
    while(num)
    {
        r=num%2;
        if(r==1)
            cnt++;
        num/=2;
    }
    return cnt;
}
// hexa convert
int hexa(int num)
{
    int cnt=0;
    while(num)
    {
        int r=num%10;
        cnt+=binary(r);
        num/=10;
    }
    return cnt;
}
int main()
{
    int test;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    for(int tc=1;tc<=test;tc++)
    {
        int num;
        scanf("%d",&num);
        int b1=binary(num);
        int b2=hexa(num);
        cout<<b1<<" "<<b2<<endl;
    }
    return 0;
}
