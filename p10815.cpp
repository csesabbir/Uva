#include<bits/stdc++.h>
using namespace std;
int main()
{
    set<string>sp;
    set<string>::iterator it;
    string str;
    freopen("input.txt","r",stdin);
    while(cin>>str)
    {
        string str1="";

            for(int i=0;i<str.length();i++)
            {
                if(isalpha(str[i])>0)
                    str1+=tolower(str[i]);
                else if(str1!="")
                {
                    sp.insert(str1);
                    str1="";
                }
            }
            if(str1!="")
                sp.insert(str1);
    }
    // output andy's dic
    for(it=sp.begin();it!=sp.end();it++)
        cout<<*it<<endl;
    return 0;
}
