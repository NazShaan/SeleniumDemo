package patterns;

import java.util.Scanner;

public class SquirePattern {

	public static void main(String[] args) {
		int row, col, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter the row number");
		n=input.nextInt();
		for(row = 1 ; row<=n; row++)
		{
			for(col=1; col<=n; col++)
			{
				if(col==n || col ==1 || row ==1 || row ==n)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}


	}

}
