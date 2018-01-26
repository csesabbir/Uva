#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    //freopen("input.txt","r",stdin);
    while(cin>>str)
    {
        string str1="";
        int a=0;
        for(int i=0;i<str.length();i++)
        {

            switch(str[i])
            {
            case 'B':
            case 'F':
            case 'P':
            case 'V':
                if(a!=1)
                    {str1+='1';a=1;}
                    break;
            case 'C':
            case 'G':
            case 'J':
            case 'K':
            case 'Q':
            case 'S':
            case 'X':
            case 'Z':
                if(a!=2)
                    {str1+='2';a=2;}
                    break;
            case 'D':
            case 'T':
                if(a!=3)
                    {str1+='3';a=3;}
                    break;
            case 'L':
                if(a!=4)
                    {str1+='4';a=4;}
                    break;
            case 'M':
            case 'N':
                if(a!=5)
                    {str1+='5';a=5;}
                    break;
            case 'R':
                if(a!=6)
                    {str1+='6';a=6;}
                    break;
            default:
                a=0;
                break;
            }
        }
        cout<<str1<<endl;
        str1.clear();
    }
    return 0;
}
