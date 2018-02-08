#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    //freopen("input.txt","r",stdin);
    while(cin>>str)
    {
        for(int i=0;i<str.length();i++)
        {
            switch(str[i])
            {
            case 'A':
            case 'B':
            case 'C':
                cout<<2;
                break;
            case 'D':
            case 'E':
            case 'F':
                cout<<3;
                break;
            case 'G':
            case 'H':
            case 'I':
                cout<<4;
                break;
            case 'J':
            case 'K':
            case 'L':
                cout<<5;
                break;
            case 'M':
            case 'N':
            case 'O':
                cout<<6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                cout<<7;
                break;
            case 'T':
            case 'U':
            case 'V':
                cout<<8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                cout<<9;
                break;
            default:
                cout<<str[i];
                break;
            }
        }
        cout<<endl;
    }
    return 0;
}
