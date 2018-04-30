import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
           int num=sc.nextInt();
           if(num==0)
               break;
           int p=0;
           String str="";
           while(num!=0)
           {
               int r=num%2;
               if(r==1)
                   p++;
               str+=String.valueOf(r);
               num/=2;
           }
           StringBuilder bb=new StringBuilder(str);
           String str1=(bb.reverse()).toString();
           System.out.println("The parity of "+str1+" is "+p+" (mod 2).");

        }

        //sc.close();
    }
}