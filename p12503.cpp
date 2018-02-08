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
        string arr[n+2];
        string str,str1;
        int p=0,k=0;
        cin>>ws;
        for(int i=1;i<=n;i++)
        {
            cin>>str;
            if(str=="LEFT")
            {
                --p;
                arr[i]=str;
            }
            else if(str=="RIGHT")
            {
                ++p;
                arr[i]=str;
            }
            else if(str=="SAME")
            {
                cin>>str1>>k;
                if(arr[k]=="LEFT")
                {
                    --p;
                    arr[i]=arr[k];
                }
                else if(arr[k]=="RIGHT")
                {
                    ++p;
                    arr[i]=arr[k];
                }
            }
        }
        cout<<p<<endl;
    }
    return 0;
}
