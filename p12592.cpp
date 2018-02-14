#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    scanf("%d",&n);
    string str,str1;
    map<string,string>ss;
    scanf("%*d");
    for(int i=1;i<=n;i++)
    {
        getline(cin,str);
        getline(cin,str1);
        ss.insert(make_pair(str,str1));
    }
    scanf("%d",&n);
    cin>>ws;
    for(int i=1;i<=n;i++)
    {
        getline(cin,str);
        cout<<ss[str]<<endl;

    }
    ss.clear();
    return 0;
}
