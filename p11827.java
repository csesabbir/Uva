import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
            int test=Integer.valueOf(sc.nextLine());
            for(int tc=1;tc<=test;tc++)
            {
                String str=sc.nextLine();
                StringTokenizer st=new StringTokenizer(str);
                ArrayList<Integer> v=new ArrayList<Integer>();
                while(st.hasMoreElements())
                {
                    String temp=st.nextToken();
                    v.add(Integer.parseInt(temp));
                }
                int mx=0;
                for(int i=0;i<v.size()-1;i++) {
                    for (int j = i + 1; j < v.size(); j++) {
                        int a = v.get(i);
                        int b = v.get(j);
                        if (a > b) {
                            int x = gcd(a, b);
                            if (mx < x)
                                mx = x;
                        } else {
                            int x = gcd(b, a);
                            if (mx < x)
                                mx = x;
                        }
                    }
                }
               System.out.println(mx);
            }
        sc.close();
    }
}