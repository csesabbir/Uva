import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n,k;
        while(sc.hasNext())
        {
            n=sc.nextInt();
            k=sc.nextInt();
            int sum=n;
            while(n>=k)
            {
                sum+=(n/k);
                n=(n/k)+(n%k);
            }
            System.out.println(sum);
        }
    }
}