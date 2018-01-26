#include<bits/stdc++.h>
using namespace std;
/*struct web{
    string str;
    int pp;
};*/
int main()
{
    int test;
    freopen("input.txt","r",stdin);
    scanf("%d",&test);
    vector<string> ans;
    int r,best;
    string str;
    scanf("%*d");
    for(int k=1;k<=test;k++){
            //struct web num[10];
            best=-1;
        for(int i=0;i<10;i++)
        {
            cin>>str>>r;
            if(r>best)
            {
                best=r;
                ans.clear();
                ans.push_back(str);
            }
            else if(r==best)
                ans.push_back(str);
        }
        cout<<"Case #"<<k<<":"<<endl;
        for(int i=0;i<ans.size();i++)
            cout<<ans[i]<<endl;
    }
    return 0;
}
