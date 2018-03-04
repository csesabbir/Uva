#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,m;
    map<string,string> myMap;
    vector<string> vv;
    map<string,string>::iterator it;
   // freopen("input.txt","r",stdin);
    scanf("%d%d",&n,&m);
    string str1,str2;
    for(int i=0;i<n;i++)
    {
        cin>>str1>>str2;
        myMap.insert(make_pair(str1,str2));
    }
    for(int i=0;i<m;i++)
    {
        cin>>str1;
        vv.push_back(str1);
    }
    //
    for(int i=0;i<vv.size();i++)
    {
        it=myMap.find(vv[i]);
        if(it!=myMap.end())
            cout<<myMap[vv[i]]<<endl;
        else
        {
            str1=vv[i];
            int len=str1.length();
            if(str1[len-1]=='y')
            {
                if(str1[len-2]=='a' || str1[len-2]=='e' || str1[len-2]=='i' || str1[len-2]=='o'||str1[len-2]=='u')
                    cout<<str1<<"s"<<endl;
                else
                {
                    for(int k=0;k<str1.length()-1;k++)
                        cout<<str1[k];
                    cout<<"ies"<<endl;
                }
            }
            else if(str1[len-1]=='o' || str1[len-1]=='x' || str1[len-1]=='s')
            {
                cout<<str1<<"es"<<endl;
            }
            else if((str1[len-1]=='h' && str1[len-2]=='c') || (str1[len-1]=='h' && str1[len-2]=='s'))
            {
                cout<<str1<<"es"<<endl;
            }
            else
                cout<<str1<<"s"<<endl;
        }
    }
    return 0;
}
