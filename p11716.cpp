#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    string str;
   // freopen("input.txt","r",stdin);
    scanf("%d",&test);
    cin>>ws;
    for(int tc=1;tc<=test;tc++)
    {
        getline(cin,str);
        int len=str.length();
        int d=sqrt(double(len));
        if(len==d*d)
        {
            for(int i=1;i<=d;i++)
            {
                int k=i-1;
                int s=1;
                while(s<=d)
                {
                    printf("%c",str[k]);
                    k+=d;
                    s++;
                }
            }
        }
        else
            printf("INVALID");
        printf("\n");
    }
    return 0;
}
