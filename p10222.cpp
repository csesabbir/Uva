#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    //freopen("input.txt","r",stdin);
    while(getline(cin,str))
    {
        char c;
        for(int i=0;i<str.length();i++)
        {
            if(isalpha(str[i])>0)
            {
               c=tolower(str[i]);
            }
            else
                c=str[i];
            switch(c)
            {
            case ']':
                cout<<"p";
                break;
            case '[':
                cout<<"o";
                break;
            case 'p':
                cout<<"i";
                break;
            case 'o':
                cout<<"u";
                break;
            case 'i':
                cout<<"y";
                break;
            case 'u':
                cout<<"t";
                break;
            case 'y':
                cout<<"r";
                break;
            case 't':
                cout<<"e";
                break;
            case 'r':
                cout<<"w";
                break;
            case 'e':
                cout<<"q";
            case '\'':
                cout<<"l";
                break;
            case ';':
                cout<<"k";
                break;
            case 'l':
                cout<<"j";
                break;
            case 'k':
                cout<<"h";
                break;
            case 'j':
                cout<<"g";
                break;
            case 'h':
                cout<<"f";
                break;
            case 'g':
                cout<<"d";
                break;
            case 'f':
                cout<<"s";
                break;
            case 'd':
                cout<<"a";
                break;
            case '.':
                cout<<"m";
                break;
            case ',':
                cout<<"n";
                break;
            case 'm':
                cout<<"b";
                break;
            case 'n':
                cout<<"v";
                break;
            case 'b':
                cout<<"c";
                break;
            case 'v':
                cout<<"x";
                break;
            case 'c':
                cout<<"z";
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
