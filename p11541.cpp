#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    string str;
    //freopen("input.txt","r",stdin);
    scanf("%d",&test);
    for(int tc=1;tc<=test;tc++)
    {
        cin>>str;
        int n=0;
        cout<<"Case "<<tc<<": ";
        for(int i=0;i<str.length();i++)
        {
            if(isalpha(str[i])>0)
            {
                char c=str[i];
                for(int j=i+1;j<str.length();j++)
                {
                    if(isalpha(str[j])>0)
                    {
                        i=j-1;
                        break;
                    }
                    n=n*10+str[j]-'0';
                }
                for(int k=1;k<=n;k++)
                    cout<<c;
                n=0;
            }
        }
        cout<<endl;
    }
    return 0;
}
