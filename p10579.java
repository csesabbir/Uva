import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		while(sc.hasNext())
		{
			int n=sc.nextInt();
			BigInteger f1=BigInteger.ONE;
			BigInteger f2=BigInteger.ONE;
			BigInteger temp=BigInteger.ZERO;
			
			while(n>=3)
			{
				temp=f1.add(f2);
				f1=f2;
				f2=temp;
				n--;
			}
			System.out.println(temp);
		}
		sc.close();
	}
}