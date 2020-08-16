package arrayPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i<=20; i++)
		{
			li.add(i);
		}
		System.out.println(li);
		ListIterator<Integer> val = li.listIterator();
		
		while( val.hasNext())
		{
			Integer values = val.next();
			if(values%2==0)
			{
				System.out.println(values);
			}
			else 
			{
				val.remove();
			}
			
		}
		System.out.println(li);
		
	}

}
