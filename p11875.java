import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int test=Integer.valueOf(sc.nextLine());
        for(int tc=1;tc<=test;tc++)
        {
            int n;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            System.out.println("Case "+tc+": "+arr[((n+1)/2)-1]);
        }
    }
}