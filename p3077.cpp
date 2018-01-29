#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    int x,y,test;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    for(int i=0;i<test;i++)
    {
        scanf("%d%d",&x,&y);
        if(x<y)
            printf("NO BRAINS\n");
        else
            printf("MMM BRAINS\n");
    }
    return 0;
}
