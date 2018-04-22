import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static long gcd(long a, long b)
    {
        if(b==0)
            return a;
        else
           return gcd(b,a%b);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int test=Integer.valueOf(sc.nextLine());
        for(int tc=1;tc<=test;tc++)
        {
            long n=sc.nextLong();
            long arr[]=new long[(int) n];
            long lcm=1;
            for(int t=0;t<n;t++)
            {
                arr[t]=sc.nextLong();
                lcm*=arr[t];
            }
            long upper=n*lcm;
            long lower=0;
            for(int i=0;i<n;i++)
                    lower+=lcm/arr[i];
            long g=0;
            if(upper>lower)
                g=gcd(upper,lower);
            else
                g=gcd(lower,upper);
            System.out.println("Case "+tc+": "+upper/g+"/"+lower/g);
        }
        sc.close();
    }
}