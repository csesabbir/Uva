/**
    Dedicated to
    Aisha Ferdushi Shuborna
**/
#include<bits/stdc++.h>
using namespace std;
int main()
{
    map<string,int>nt;
    map<string,int>::iterator it;
    int num,t=1;
    //freopen("input.txt","r",stdin);
    while(cin>>num)
    {
        string str;
        string arr[num];
        for(int i=0;i<num;i++)
            cin>>arr[i];
        for(int i=0;i<num;i++)
            nt.insert(make_pair(arr[i],0));
        int gm,pp;
        string str1;
        for(int i=0;i<num;i++)
        {
            cin>>str1>>gm>>pp;
            if(pp!=0)
            {
                nt[str1]-=(gm-(gm%pp));
                for(int j=0;j<pp;j++)
                {
                    cin>>str;
                    nt[str]+=(gm/pp);
                }
            }
        }
        //output result
        if(t++ >1) //each group separted by a new line
            cout<<endl;
        for(int i=0;i<num;i++)
            cout<<arr[i]<<" "<<nt[arr[i]]<<endl;
        nt.clear();
    }
    return 0;
}
