import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static String  factorial(int n)
    {
        BigInteger f=BigInteger.ONE;
        for(int i=1;i<=n;i++)
            f=f.multiply(new BigInteger(i+""));
        return f.toString();
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
           int n=Integer.valueOf(sc.nextLine());
           String str=factorial(n);
           long  sum=0;
           for(int i=0;i<str.length();i++)
           {
               sum+=str.charAt(i)-'0';
           }
           System.out.println(sum);
        }

        sc.close();
    }
}