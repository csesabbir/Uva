import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//BigInteger g,l;
		int test=sc.nextInt();
		for(int tc=1;tc<=test;tc++)
		{
			BigInteger g=sc.nextBigInteger();
			BigInteger l=sc.nextBigInteger();
			BigInteger k=l.mod(g);
			BigInteger z=new BigInteger("0");
			int res=k.compareTo(z);
			if(res==0)
				System.out.println(g+" "+l);
			else
				System.out.println(-1);
		}

	}

}
