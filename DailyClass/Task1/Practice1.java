package Task1;

import java.util.Scanner;

public class Practice1 
 {
	public static void main(String[] args)
	{  
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		N = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=N;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
    }
 }
