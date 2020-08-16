package patterns;

public class RightAngel1 {

	public static void main(String[] args) {
		int row, col, n;
		n = 5;
		
		for (row = 1; row <=n; row++)
		{
			for(col = 1; col<=n; col++ )
			{
				if(col==row)
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
