#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    scanf("%d",&test);
    for(int tc=1;tc<=test;tc++)
    {
        int n;
        scanf("%d",&n);
        int mile,juice,duration;
        mile=juice=0;
        for(int i=1;i<=n;i++)
        {
            scanf("%d",&duration);
            mile+=(duration/30)+1;
            juice+=(duration/60)+1;
        }
        mile=mile*10;
        juice=juice*15;
        if(mile==juice)
            cout<<"Case "<<tc<<": "<<"Mile Juice "<<mile<<endl;
        else if(mile<juice)
            cout<<"Case "<<tc<<": "<<"Mile "<<mile<<endl;
         else if(mile>juice)
            cout<<"Case "<<tc<<": "<<"Juice "<<juice<<endl;
    }
    return 0;
}
