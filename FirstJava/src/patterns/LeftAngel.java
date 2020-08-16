package patterns;

public class LeftAngel {

	public static void main(String[] args) {
		
		int row, col, n;
		n = 5;
		
		for(row = n; row>=1; row--)
		{
			for(col = 1; col<=row; col++)
			{
				System.out.print(" x ");
			}
			System.out.println();
		}
		
		//****************************************
		
		for(row = 1; row<=n; row++ )
		{
			for(col=1; col<=row; col++)
			{
				System.out.print(" 0 ");
			}
			System.out.println();
		}


	}

}
