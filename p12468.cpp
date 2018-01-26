#include<cstdio>
#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int a,b;
    while(1)
    {
        scanf("%d%d",&a,&b);
        if(a==-1 && b==-1)
            break;

        int x=0,y=0;
        if(a<b)
        {
            x=b-a;
            y=100-b+a;
            cout<<min(x,y)<<endl;
        }
        else
        {
            x=a-b;
            y=100-a+b;
            cout<<min(x,y)<<endl;
        }
// endl of code
    }
    return 0;
}
