import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			// taking input
			int arr[]=new int[5];
			for(int i=0;i<5;i++)
			{
				int num=sc.nextInt();
				arr[i]=num;
			}
			int arr1[]=new int[5];
			for(int i=0;i<5;i++)
			{
				int num=sc.nextInt();
				arr1[i]=num;
			}
			// end taking input
			// process start
			boolean flag=true;
			for(int i=0;i<5;i++)
			{
				if(!((arr1[i]==1 && arr[i]==0) || (arr1[i]==0 && arr[i]==1)))
				{
					flag=false;
					break;
				}
			}
			// process end
			if(flag==true)
				System.out.println("Y");
			else 
				System.out.println("N");
		}
		sc.close();
	}
}