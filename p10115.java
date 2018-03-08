import java.util.Scanner;


public class Main
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str;
		while((str=sc.nextLine())!=null)
		{
			int num=Integer.valueOf(str);
			if(num==0)
				System.exit(0);
			else
			{
				String []key=new String[num];
				String []value=new String[num];
				for(int i=0;i<num;i++)
				{
					String str1=sc.nextLine();
					String str2=sc.nextLine();
					key[i]=str1;
					value[i]=str2;
				}
				String str3=sc.nextLine();
				/* processing start */

				for(int i=0;i<num;i++)
				{
					while(str3.indexOf(key[i])>=0)
					{
						str3=str3.replaceFirst(key[i], value[i]);
						
					}
				}
				System.out.println(str3);
				/* processing end */
			}
		}
		sc.close();
	}
}
