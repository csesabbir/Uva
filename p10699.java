package ProblemsSolution;

import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        while(sc.hasNext())
        {
            n=Integer.valueOf(sc.nextLine());
            if(n==0)
                break;
            System.out.print(n+" : ");
            int ans=0;
            for(int i=2;i<=Math.sqrt(Double.valueOf(n));i++)
            {
                if(n%i==0)
                    ans++;
                while(n%i==0)
                    n/=i;
            }
            if(n!=1)
                ans++;
            System.out.println(ans);
        }
    }
}