#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    printf("Lumberjacks:\n");
    for(int tc=1;tc<=test;tc++)
    {
        int arr[10];
        for(int i=0;i<10;i++)
            scanf("%d",&arr[i]);
        bool flag=true;
        if(arr[0]<arr[1])
        {
            for(int i=0;i<10-1;i++)
            {
                if(arr[i]<arr[i+1])
                    flag=true;
                else{
                    flag=false;
                    break;
                }
            }
        }
        else if(arr[0]>arr[1])
        {
            for(int i=0;i<10-1;i++)
            {
                if(arr[i]>arr[i+1])
                    flag=true;
                else{
                    flag=false;
                    break;
                }
            }
        }
        if(flag)
            printf("Ordered\n");
        else
            printf("Unordered\n");
    }
    return 0;

}
