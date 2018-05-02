import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        BigInteger a,b,sum=BigInteger.ZERO;
        while(true)
        {
            a=sc.nextBigInteger();
            String str=a.toString();
            if(str.charAt(0)=='0')
                break;
            sum=sum.add(a);
        }
        System.out.println(sum);
    }
}