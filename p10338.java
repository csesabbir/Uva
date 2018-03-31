import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.math.BigInteger;

public class Main{
    public static BigInteger factorial(int n)
    {
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++)
            fact=fact.multiply(new BigInteger(i+""));
        return fact;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int test=Integer.valueOf(sc.nextLine());
        for(int tc=1;tc<=test;tc++)
        {

            String str=sc.nextLine();
            int arr[]=new int[200];
            int len=str.length();
            HashSet<Character> set=new HashSet<Character>();
            for(int i=0;i<str.length();i++)
            {
                ++arr[str.charAt(i)];
                set.add(str.charAt(i));
            }
            Iterator<Character> it=set.iterator();
            BigInteger len2=factorial(len);
            while(it.hasNext())
            {
                Character c=it.next();
                len2=len2.divide(factorial(arr[c]));
            }
            System.out.println("Data set "+tc+": "+len2);
        }
        sc.close();
    }
}
