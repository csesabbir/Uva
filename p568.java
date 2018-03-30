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
    public static void Check(String str,int n)
    {
        if(n<10)
            System.out.print("    ");
        else if(n<100)
            System.out.print("   ");
        else if(n<1000)
            System.out.print("  ");
        else if(n<10000)
            System.out.print(" ");

        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!='0')
            {
                System.out.println(n+" -> "+str.charAt(i));
                break;
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
           int n=Integer.valueOf(sc.nextLine());
           String str=factorial(n);
           Check(str,n);
        }

        sc.close();
    }
}