#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    //freopen("input.txt","r",stdin);
    while(getline(cin,str))
    {
        string str1="";
        for(int i=0;i<str.length();i++)
        {
            if(str[i]!=' ')
                str1+=str[i];
            else
            {
                reverse(str1.begin(),str1.end());
                cout<<str1<<" ";
                str1.clear();
            }
        }
        reverse(str1.begin(),str1.end());
        cout<<str1<<endl;
    }
    return 0;
}
