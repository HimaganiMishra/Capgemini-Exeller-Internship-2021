package Task1;

import java.util.Scanner; 

public class Practice2 
{
	public static void main(String[] args)
	{ 
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		N = sc.nextInt();
		sc.close();
		
		for (int i=0; i<N; i++)
        {
            for (int j=N-i; j>1; j--)
            {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ )
            {
                    System.out.print("* ");
            }
  
            System.out.println();
		}
	}
}
