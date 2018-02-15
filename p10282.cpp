#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    map<string,string>dic;
    map<string,string>::iterator it;
    //freopen("input.txt","r",stdin);
    while(getline(cin,str))
    {
        if(str=="")
            break;
        istringstream iss(str);
        vector<string> vv(istream_iterator<string>{iss},istream_iterator<string>());
        dic.insert(make_pair(vv[1],vv[0]));
    }
    // word input
    while(cin>>str)
    {
        it=dic.find(str);
        if(it!=dic.end())
            cout<<it->second<<endl;
        else
            cout<<"eh"<<endl;
    }
    return 0;
}
