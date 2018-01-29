#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
   // freopen("input.txt","r",stdin);
    int i=1;
    while(1)
    {
        cin>>str;
        if(str=="*")
            break;
        if(str=="Hajj")
            cout<<"Case "<<i<<": "<<"Hajj-e-Akbar"<<endl;
        else if(str=="Umrah")
            cout<<"Case "<<i<<": "<<"Hajj-e-Asghar"<<endl;
        i++;
    }
    return 0;
}
