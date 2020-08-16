package patterns;

public class RightAngel {

	public static void main(String[] args) {
		int row, col, n;
		n=5;
		for(row = 1; row<=n; row++ )
		{
			for(col=1; col<=row; col++)
			{
				System.out.print(" x ");
			}
			System.out.println();
		}

	}

}
