#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    //freopen("input.txt","r",stdin);
    string str;
    while(cin>>str)
    {
        for(int i=0;i<str.length();i++)
            printf("%c",str[i]-7);
        printf("\n");
    }
}
