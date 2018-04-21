import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static int gcd(int n1, int n2)
    {
        if (n2 != 0)
            return gcd(n2, n1 % n2);
        else
            return n1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int test=Integer.valueOf(sc.nextLine());
            if(test==0)
                break;
            int g=0;
            for(int i=1;i<test;i++)
            {
                for(int j=i+1;j<=test;j++)
                    g+=gcd(j,i);
            }
            System.out.println(g);
        }
        sc.close();
    }
}