import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==0 && b==0)
                break;
            int cnt=0;
            for(int i=a;i<=b;i++)
            {
                int t1=Integer.valueOf((int) Math.sqrt(Double.valueOf(i)));
                if(t1*t1==i)
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}
