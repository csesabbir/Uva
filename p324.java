import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static String factorial(int n)
    {
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            fact=fact.multiply(new BigInteger(i+""));
        }
        return fact.toString();
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int num=Integer.valueOf(sc.nextLine());
            if(num==0)
                break;
            String str=factorial(num);
            int arr[]=new int[10];
            for(int i=0;i<str.length();i++)
            {
                ++arr[str.charAt(i)-'0'];
            }
            // output this line
            System.out.println(num+"! --");
            System.out.println("    (0)    "+arr[0]+"    (1)    "+arr[1]+"    (2)    "+arr[2]+"    (3)    "+arr[3]+"    (4)    "+arr[4]);
            System.out.println("    (5)    "+arr[5]+"    (6)    "+arr[6]+"    (7)    "+arr[7]+"    (8)    "+arr[8]+"    (9)    "+arr[9]);
        }
        sc.close();
    }
}