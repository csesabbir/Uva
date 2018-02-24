#include<bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    scanf("%d",&test);
    for(int tc=1;tc<=test;tc++)
    {
        string str;
        cin>>str;
        string str1="";
        string str2="";
        for(int i=0;i<3;i++)
            str1+=str[i];

        for(int i=4;i<8;i++)
            str2+=str[i];
        //cout<<str1<<" "<<str2<<endl;
        //
        int len=str1.length()-1;
        int num=0;
        for(int i=0;i<3;i++)
        {
            switch(str1[i])
            {
                case 'A':
                    num+=0*pow(26,len);
                    len--;
                    break;
                case 'B':
                    num+=1*pow(26,len);
                    len--;
                    break;
                case 'C':
                    num+=2*pow(26,len);
                    len--;
                    break;
                case 'D':
                    num+=3*pow(26,len);
                    len--;
                    break;
                case 'E':
                    num+=4*pow(26,len);
                    len--;
                    break;
                case 'F':
                    num+=5*pow(26,len);
                    len--;
                    break;
                case 'G':
                    num+=6*pow(26,len);
                    len--;
                    break;
                case 'H':
                    num+=7*pow(26,len);
                    len--;
                    break;
                case 'I':
                    num+=8*pow(26,len);
                    len--;
                    break;
                case 'J':
                    num+=9*pow(26,len);
                    len--;
                    break;
                case 'K':
                    num+=10*pow(26,len);
                    len--;
                    break;
                case 'L':
                    num+=11*pow(26,len);
                    len--;
                    break;
                case 'M':
                    num+=12*pow(26,len);
                    len--;
                    break;
                case 'N':
                    num+=13*pow(26,len);
                    len--;
                    break;
                case 'O':
                    num+=14*pow(26,len);
                    len--;
                    break;
                case 'P':
                    num+=15*pow(26,len);
                    len--;
                    break;
                case 'Q':
                    num+=16*pow(26,len);
                    len--;
                    break;
                case 'R':
                    num+=17*pow(26,len);
                    len--;
                    break;
                case 'S':
                    num+=18*pow(26,len);
                    len--;
                    break;
                case 'T':
                    num+=19*pow(26,len);
                    len--;
                    break;
                case 'U':
                    num+=20*pow(26,len);
                    len--;
                    break;
                case 'V':
                    num+=21*pow(26,len);
                    len--;
                    break;
                case 'W':
                    num+=22*pow(26,len);
                    len--;
                    break;
                case 'X':
                    num+=23*pow(26,len);
                    len--;
                    break;
                case 'Y':
                    num+=24*pow(26,len);
                    len--;
                    break;
                case 'Z':
                    num+=25*pow(26,len);
                    len--;
                    break;
            }
        }
        int pp=0;
        for(int i=0;i<str2.length();i++)
            pp=pp*10+str2[i]-'0';
        if(abs(pp-num)<=100)
            cout<<"nice"<<endl;
        else
            cout<<"not nice"<<endl;

    }
    return 0;
}
