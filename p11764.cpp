#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,test;
    scanf("%d",&test);
    for(int tc=1;tc<=test;tc++)
    {
        scanf("%d",&n);
        int arr[n];
        for(int i=0;i<n;i++)
            scanf("%d",&arr[i]);
        if(n==1)
            printf("Case %d: %d %d\n",tc,0,0);
        else
        {
            int l,h;
            l=h=0;
            for(int i=0;i<n-1;i++)
            {
                if(arr[i]==arr[i+1])
                    continue;
                if(arr[i]<arr[i+1])
                    h++;
                else
                    l++;
            }
            printf("Case %d: %d %d\n",tc,h,l);
        }
    }
    return 0;
}
