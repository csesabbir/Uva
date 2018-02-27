import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String str=sc.nextLine();
			if(str.charAt(0)=='-')
				break;
			int sum=0;
			if(str.length()>2&&(str.charAt(0)=='0' && str.charAt(1)=='x'))
			{
				int k=0;
				for(int i=str.length()-1;i>=2;i--)
				{
					double kk=Double.valueOf(k);
					if(str.charAt(i)=='A')
						sum+=10*Math.pow(16.0, kk);
					else if(str.charAt(i)=='B')
						sum+=11*Math.pow(16.0, kk);
					else if(str.charAt(i)=='C')
						sum+=12*Math.pow(16.0, kk);
					else if(str.charAt(i)=='D')
						sum+=13*Math.pow(16.0, kk);
					else if(str.charAt(i)=='E')
						sum+=14*Math.pow(16.0, kk);
					else if(str.charAt(i)=='F')
						sum+=15*Math.pow(16.0, kk);
					else {
						int s=str.charAt(i)-'0';
						sum+=s*Math.pow(16.0, kk);
					}
					k++;
				}
				System.out.println(sum);
				sum=0;
			}else {
				int num=Integer.valueOf(str);
				String str1="";
				if(num==0)
				{
					System.out.print("0x");
					System.out.println(num);
				}else {
				while(num!=0)
				{
					int r=num%16;
					if(r==10)
						str1+="A";
					else if(r==11)
						str1+="B";
					else if(r==12)
						str1+="C";
					else if(r==13)
						str1+="D";
					else if(r==14)
						str1+="E";
					else if(r==15)
						str1+="F";
					else
						str1+=String.valueOf(r);
					num/=16;
				}
				System.out.print("0x");

				for(int i=str1.length()-1;i>=0;i--)
					System.out.print(str1.charAt(i));
				System.out.println();
				}
			}

		}
		sc.close();
	}

}
