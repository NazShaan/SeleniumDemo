import java.util.ArrayList;
import java.util.Arrays;

public class Mx2No {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] arr = {3,4,3,5,6,7,8,9,3};
		for(int a: arr)
		{
		System.out.print(a+",  ");
		
		}
		
		 Arrays.sort(arr);
		 System.out.println();
		 for(int a: arr)
			{
			if(!al.contains(a))
			{
				al.add(a);
			
			
			}
			}
		 System.out.println(al);
		int t = al.size();
		t=t-2;
		 System.out.println(al.get(t));
		 
	}

}
