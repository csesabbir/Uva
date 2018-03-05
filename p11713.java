import java.util.Scanner;
public class Main
{
	public static boolean isVowel(char c)
	{
		if(c=='a'||c=='e'|| c=='i'|| c=='o'||c=='u')
			return true;
		else
			return false;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.valueOf(sc.nextLine());
		for(int tc=1;tc<=num;tc++)
		{
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			int l1=str1.length();
			int l2=str2.length();
			if(l1==l2)
			{
				boolean flag=true;
				for(int i=0;i<str1.length();i++)
				{
					boolean flag1=isVowel(str1.charAt(i));
					boolean flag2=isVowel(str2.charAt(i));
					if(flag1==true && flag2==true)
						continue;
					else if(flag1==true && flag2==false || flag1==false && flag2==true)
					{
						flag=false;
						break;
					}
					else if(flag1==false && flag2==false)
						{
							if(str1.charAt(i)!=str2.charAt(i))
							{
								flag=false;
								break;
							}

						}
				}
				if(flag==true)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			else
			{
				System.out.println("No");
			}
		}
		sc.close();
	}
}