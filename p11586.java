import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int nLine=Integer.valueOf(in.nextLine());
		for(int i=1;i<=nLine;i++)
		{
			String str=in.nextLine();
			String word[]=str.split(" ");
			String str1="";
			for(int k=0;k<word.length;k++)
				str1+=word[k];
			//System.out.println(str1.length());
			int m=0;
			for(int k=0;k<str1.length();k++)
			{ 
				if(str1.charAt(k)=='M')
					m++;
				else 
					m--;
			}
			if(m==0 && str1.length()>2)
				System.out.println("LOOP");
			else
				System.out.println("NO LOOP");

		}
	}
}