import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            long  a=sc.nextInt();
            long  b=sc.nextInt();
            if(a==0 && b==0)
                break;
            long  c=0;
            long  cnt=0;
            while(a!=0 || b!=0)
            {
                long  r1=a%10;
                long r2=b%10;
                long  temp=r1+r2+c;
                if(temp>9)
                {
                    c=1;
                    cnt++;
                }
                else
                    c=0;
                a/=10;
                b/=10;
            }
            if(cnt==0)
                System.out.println("No carry operation.");
            else if(cnt==1)
                System.out.println(cnt+" carry operation.");
            else
                System.out.println(cnt+" carry operations.");
        }
        sc.close();
    }
}