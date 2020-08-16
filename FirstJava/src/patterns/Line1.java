package patterns;

public class Line1 {

	public static void main(String[] args) {
		int row, col, n;
		n =5;
		
		for (row = n; row>=1; row--)
		{
			for(col = 1; col <=n; col++)
			{
				
				
				if(col == row)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
