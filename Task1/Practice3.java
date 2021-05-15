package Task1;

import java.util.Scanner; 

public class Practice3 {

	public static void main(String[] args)
	{
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		N = sc.nextInt();
		sc.close();
		
		for (int i=1; i<= N ; i++)  
		{  
		for (int j = i; j<N ; j++)   
		{  
		System.out.print(" ");  
		}     
		for (int k = 1; k <= (2*i -1) ;k++)   
		{  
		if(k==1 || i == N || k==(2*i-1))   
		{  
		System.out.print("*");  
		}  
		else   
		{  
		System.out.print(" ");  
		}  
		}  
		System.out.println("");  
		}  
	}  
}

