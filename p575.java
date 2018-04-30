import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String []args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str= br.readLine())!=null)
        {
            //str=sc.nextLine();
            if(str.charAt(0)=='0')
              break;
            long p=0;
            StringBuilder aa=new StringBuilder(str);
            str=(aa.reverse()).toString();
            for(int i=0;i<str.length();i++)
            {
                long a=str.charAt(i)-'0';
                p+=a*(Math.pow(2,i+1)-1);
            }
            System.out.println(p);
        }
    }
}