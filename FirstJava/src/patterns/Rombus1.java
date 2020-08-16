package patterns;

public class Rombus1 {

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
		
		
		//****************************************
		 n=n-1;  // redefine n value to adjust the rombus;
		for(row = n; row >=1; row--)
		{
			for(col = 0; col<=n-row; col++)  // change col = 1 to 0
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
