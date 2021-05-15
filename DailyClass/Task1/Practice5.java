package Task1;

import java.util.Scanner; 

public class Practice5
{
	public static void main(String[] args)
	{
		int N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		N = sc.nextInt();
		sc.close();
		
		for (int i=1; i<= N ; i++) { for (int j = N; j > i ; j--) 
		{
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) { System.out.print(" "); } if( i==1) { System.out.println(""); } else { System.out.println("*"); } } for (int i=N-1; i>= 1 ; i--)
        {
        for (int j = N; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) {
            System.out.print(" ");
        }
        if( i==1)
            System.out.println("");
        else
            System.out.println("*");
    }
	}
}
