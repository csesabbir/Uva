#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    string str;
    vector<string>v;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    cin>>ws;
    for(int tc=1;tc<=test;tc++)
    {
        while(getline(cin,str))
        {
            if(str=="")
                break;
            istringstream iss(str);
            vector<string> rr(istream_iterator<string>{iss},istream_iterator<string>());
            int ll=0;
            string str2="";
            for(int i=0;i<rr.size();i++)
            {
                string str1="";
                str1=rr[i];
                int len=str1.length();
                if(len>ll)
                {
                    str2+=str1[ll];
                    ll++;
                }
            }
            v.push_back(str2);
        }
        cout<<"Case #"<<tc<<":"<<endl;
        for(int i=0;i<v.size();i++)
            cout<<v[i]<<endl;
        v.clear();
        if(tc!=test)
        cout<<endl;
    }
    return 0;
}
