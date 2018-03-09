#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    set<string>ps;
    //freopen("input.txt","r",stdin);
    while(cin>>str)
    {
        string str1="",temp="";
        for(int i=0;i<str.length();i++)
            {
                temp+=str[i];
                ps.insert(temp);
                temp="";
            }
        // substring
        temp="";
        for(int i=0;i<str.length()-1;i++)
        {
            str1+=str[i];
            for(int j=i+1;j<str.length();j++)
            {
                str1+=str[j];
                temp=str1;
                reverse(temp.begin(),temp.end());
                if(temp==str1)
                    ps.insert(temp);
                temp="";
            }
            str1="";
        }
        cout<<"The string '"<<str<<"' contains "<<ps.size()<<" palindromes."<<endl;
        ps.clear();
    }
    return 0;
}
