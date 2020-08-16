package arrayPractice;

public class TwoD {

	public static void main(String[] args) {
		
		int[][] arr = new int [2][2];
		
		arr[0][0] = 2;
		arr[0][1] = 3;
		arr[1][0]=4;
		arr[1][1]=5;
		
		for(int i=0; i<=arr[0].length; i++)
		{
			for(int j = 0; j<=arr[i].length; j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
