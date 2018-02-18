#include<bits/stdc++.h>
using namespace std;
int main()
{
    int pp;
    //freopen("input.txt","r",stdin);
    scanf("%d",&pp);
    string name,temp1,temp2;
    int dd,mm,yy,ty1,ty2,tm1,tm2,td1,td2;
    cin>>name>>dd>>mm>>yy;
    ty1=ty2=yy;
    td1=td2=dd;
    tm1=tm2=mm;
    for(int i=2;i<=pp;i++)
    {
        cin>>name>>dd>>mm>>yy;
        /** finding biggest person **/
        if(ty1>yy)
        {
            ty1=yy;
            temp1=name;
            td1=dd;
            tm1=mm;
        }
        else if(ty1==yy)
        {
            if(tm1>mm)
            {
                tm1=mm;
                temp1=name;
                td1=dd;
            }
            else if(tm1==mm)
            {
                if(td1>dd)
                {
                    td1=dd;
                    temp1=name;
                }
            }
        }
        /** end biggest person serach **/

        /**find smallest person search **/

         if(yy>ty2)
         {
             temp2=name;
             ty2=yy;
             td2=dd;
             tm2=mm;
         }
         else if(yy==ty2)
         {
             if(tm2==mm)
             {
                 if(dd>td1)
                 {
                     temp2=name;
                     td1=dd;
                 }
             }
             else if(mm>tm2)
             {
                 temp2=name;
                 td2=dd;
                 tm2=mm;
             }
         }

        /** end smallest person search **/

    }
    cout<<temp2<<endl;
    cout<<temp1<<endl;
    return 0;
}
