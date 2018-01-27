#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    string str;
    //freopen("input.txt","r",stdin);
    while(cin>>n)
    {
        if(n!=0)
            cin>>str;
        else
            break;
        int m=(str.length())/n;
        int k=0;
        string str1="";
        for(int i=0;i<str.length();i++)
        {
            ++k;
            str1+=str[i];
            if(k==m)
            {
                reverse(str1.begin(),str1.end());
                cout<<str1;
                str1.clear();
                k=0;
            }
        }
        cout<<endl;
    }
    return 0;
}
