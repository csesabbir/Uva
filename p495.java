package ProblemsSolution;

import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        BigInteger []F=new BigInteger[5050];
        F[0]=new BigInteger("0");
        F[1]=new BigInteger("1");
        for(int i=2;i<=5000;i++)
            F[i]=F[i-1].add(F[i-2]);
        while(sc.hasNext())
        {
            int number=Integer.valueOf(sc.nextLine());
            System.out.println("The Fibonacci number for "+number+" is "+F[number]);
        }
    }
}