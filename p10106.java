import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        BigInteger a,b,sum=BigInteger.ZERO;
        while(sc.hasNext()) {
            a=sc.nextBigInteger();
            b=sc.nextBigInteger();
            System.out.println(a.multiply(b));
        }
    }
}