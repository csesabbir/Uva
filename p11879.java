import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger a,b;
        while(sc.hasNext())
        {
            a=sc.nextBigInteger();
            int ch=a.compareTo(BigInteger.ZERO);
            if(ch==0)
                break;
            String x=a.toString();
            char s=x.charAt(x.length()-1);
            String y="";
            for(int i=0;i<x.length()-1;i++)
                y+=x.charAt(i);
            b=new BigInteger(y);
            a=new BigInteger(s+"");
            a=a.multiply(BigInteger.valueOf(5));
            b=b.subtract(a);
            b=b.abs();
            BigInteger r=b.mod(BigInteger.valueOf(17));
            int z=r.intValue();
            if(z==0)
                System.out.println(1);
            else
                System.out.println(0);
        }
        sc.close();
    }
}