package patterns;

public class ReversePyramid {

	public static void main(String[] args) {

		int row, col, n;
		n=5;
		for(row = n; row >=1; row--)
		{
			for(col = 1; col<=n-row; col++)
			{
				System.out.print("   ");
			}
			for(col = 1; col<=row*2-1; col++)  // row * 2 -1
			{
				System.out.print(" 0 ");
			}
			System.out.println();
		}
	
		

	}

}
