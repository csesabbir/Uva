#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    int a,b,test,sum=0;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    for(int i=1;i<=test;i++)
    {
        scanf("%d%d",&a,&b);
        for(int j=a;j<=b;j++)
            if(j&1)
                sum+=j;
        printf("Case %d: %d\n",i,sum);
        sum=0;
    }
    return 0;
}
