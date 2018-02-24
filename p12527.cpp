#include<bits/stdc++.h>
using namespace std;
bool Ndp(int n)
{
    vector<int>v;
    while(n!=0)
    {
        v.push_back(n%10);
        n/=10;
    }
    bool flag=true;
    for(int i=0;i<v.size()-1;i++)
        for(int j=i+1;j<v.size();j++)
            if(v[i]==v[j])
                    return false;
    return true;

}
int main()
{
    int s,e;
    //freopen("input.txt","r",stdin);

    while(cin>>s>>e)
    {
        int cnt=0;
        for(int i=s;i<=e;i++)
        {
            if(Ndp(i)==true)
                cnt++;
        }
        cout<<cnt<<endl;
        cnt=0;
    }
    return 0;
}
