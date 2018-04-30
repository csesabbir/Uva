import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("PERFECTION OUTPUT");
        while(true)
        {
            num=sc.nextInt();
            int p=0;
            if(num == 0)
                break;
            for(int i=1;i<=Integer.valueOf(num/2);i++)
            {
                if(num%i==0)
                    p+=i;
            }
            
            String str=String.valueOf(num);
            int len=str.length();
            for(int k=1;k<=5-len;k++)
                System.out.print(" ");
            if(num==p)
                System.out.println(num+"  "+"PERFECT");
            else if(p<num)
                System.out.println(num+"  "+"DEFICIENT");
            else if(p>num)
                System.out.println(num+"  "+"ABUNDANT");
        }
        System.out.println("END OF OUTPUT");
    }
}