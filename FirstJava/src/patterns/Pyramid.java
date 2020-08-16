package patterns;

public class Pyramid {

	public static void main(String[] args) {
		int row, col, n;
		n = 5;
		
		for(row =1; row<=n; row++)
		{
			for(col = 1; col <=n-row; col++)
			{
				System.out.print("   ");
			}
			for(col = 1; col <=row*2-1; col++)
			{
				System.out.print(" 0 ");
			}
			System.out.println();
		}
		
		

	}

}
