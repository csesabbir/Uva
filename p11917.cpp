#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    map<string,int>da;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    for(int tc=1;tc<=test;tc++)
    {
        string str1;
        int ll,numd,d;
        scanf("%d",&ll);
        for(int i=1;i<=ll;i++)
        {
            cin>>str1>>d;
            da.insert(make_pair(str1,d));
        }
        cin>>numd;
        cin>>str1;
        if(da[str1]==0)
            printf("Case %d: Do your own homework!\n",tc);
        else
        {
            int dd=da[str1];
            if(dd<=numd)
                printf("Case %d: Yesss\n",tc);
            else if(dd<=numd+5)
                printf("Case %d: Late\n",tc);
            else
                printf("Case %d: Do your own homework!\n",tc);
        }
        da.clear();
    }

    return 0;
}
