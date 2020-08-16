package arrayPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {

	public static void main(String[] args) {
	
		List<Integer> li = new ArrayList<Integer>();
		
		for (int i=0; i<=20; i++)
		{
			li.add(i);
		}
		System.out.println(li);
		
		ListIterator<Integer> listIter = null;
		
		listIter = li.listIterator();
		System.out.println("evern numbers");
		while (listIter.hasNext())
		{
			Integer val = listIter.next();
			
			if(val % 2 == 0)
			{
				
				System.out.print(val+" ,  ");
			}
			
		}
		
	}

}
