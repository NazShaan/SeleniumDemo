package patterns;

public class EPattern {

	public static void main(String[] args) {
		int row, col, n;
		n = 5;
		
		for(row = 1; row<=7; row++)
		{
			for(col=1; col<=n; col++)
			{
				if(row==1 || row ==7 || row ==4 || col ==1)
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
