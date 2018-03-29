import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        while(sc.hasNext())
        {
            String str=sc.nextLine();
            char temp='+';
            int sum=0;
            int []arr=new int[3];
            for(int i=0;i<str.length();++i)
            {
                if(Character.isDigit(str.charAt(i))==true)
                {
                    sum=sum*10+str.charAt(i)-'0';
                }
                else if(str.charAt(i)=='+' || str.charAt(i)=='-')
                {
                    temp=str.charAt(i);
                    arr[0]=sum;
                    sum=0;
                }
                else if(str.charAt(i)=='=')
                {
                    arr[1]=sum;
                    sum=0;
                    boolean flag=false;
                    for(i=i+1;i<str.length();i++)
                    {
                        if(str.charAt(i)=='?')
                        {
                            flag=true;
                            break;
                        }
                        else
                            sum=sum*10+str.charAt(i)-'0';
                    }
                    arr[2]=sum;
                    sum=0;
                    if(flag!=true)
                    {
                        if(temp=='+')
                        {
                            if(arr[0]+arr[1]==arr[2])
                                k++;

                        }
                        else if(temp=='-')
                        {
                            if(arr[0]-arr[1]==arr[2])
                                k++;
                        }
                    }
                }
            }
        }
        System.out.println(k);
        sc.close();
    }
}