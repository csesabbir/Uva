import java.util.Scanner;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.IOException;
public class Main
{
    public static void main(String []args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        while(sc.hasNext())
        {
        	str=sc.nextLine(); 
            StringTokenizer st=new StringTokenizer(str);
            String []words=new String [3];
            int i=0;
            while(st.hasMoreTokens())
            {
            	words[i]=st.nextToken();
            	i++;
            }
            BigInteger a=new BigInteger(words[0]);
            BigInteger b=new BigInteger(words[2]);
            String str1=words[1];
            if(str1.charAt(0)=='/')
            	System.out.println(a.divide(b));
            else if(str1.charAt(0)=='%')
            	System.out.println(a.mod(b));
        }
    }
}