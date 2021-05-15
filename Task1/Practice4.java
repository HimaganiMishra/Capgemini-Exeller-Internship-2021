package Task1;

import java.util.Scanner; 

public class Practice4
{
	public static void main(String[] args)
	{
		int N,space;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		N = sc.nextInt();
		sc.close();
		
		space = N - 1;
		for (int j = 1; j<= N; j++)
		{
		for (int i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space--;
		for (int i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		space = 1;
		for (int j = 1; j<= N - 1; j++)
		{
		for (int i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space++;
		for (int i = 1; i<= 2 * (N - j) - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
		}
		}