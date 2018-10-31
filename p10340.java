import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String s=sc.next();
            String t=sc.next();
            int len=s.length();
            int k=0,flag=0;
            for(int i=0;i<t.length();i++)
            {
                if(t.charAt(i)==s.charAt(k))
                {
                    k++;
                    if(len==k)
                        {
                            flag = 1;
                            break;
                        }
                }
            }
            if(flag==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}