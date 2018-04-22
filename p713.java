import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  test=Integer.valueOf(sc.nextLine());
        for(int tc=1;tc<=test;tc++)
        {
            BigInteger a,b;
            a=sc.nextBigInteger();
            b=sc.nextBigInteger();
            StringBuffer str1=new StringBuffer(a.toString());
            StringBuffer str2=new StringBuffer(b.toString());
            str1=str1.reverse();
            str2=str2.reverse();
            a=new BigInteger(str1.toString());
            b=new BigInteger(str2.toString());
            a=a.add(b);
            StringBuffer x=new StringBuffer(a.toString());
            x=x.reverse();
            a=new BigInteger(x.toString());
            System.out.println(a);
        }
        sc.close();
    }
}