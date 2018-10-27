import java.util.Scanner;
public class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int test=Integer.valueOf(sc.nextLine());
        for(int tc=1;tc<=test;tc++)
        {
            int n=sc.nextInt();
            int arr[]=new int[10];
            for(int i=0;i<10;i++)
                arr[i]=0;
            for(int i=1;i<=n;i++)
            {
                int temp=i;
                while(temp!=0)
                {
                    arr[temp%10]++;
                    temp/=10;
                }
            }
            for(int i=0;i<9;i++)
                System.out.print(arr[i]+" ");
            System.out.println(arr[9]);
        }
    }
}