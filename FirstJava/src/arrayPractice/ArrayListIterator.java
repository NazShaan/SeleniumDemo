package arrayPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		String[] str = {"Nuraz", "Nabiha", "Azman", "Abir", "Tamim", "Asif", "Sakib"};
		ArrayList<String> sutdents = new ArrayList<String>();
		
		for(int i=0; i<str.length; i++)
		{
			
			sutdents.add(str[i]) ;
		}
		System.out.println(sutdents);
		
	Iterator<String>	iter = sutdents.iterator();
	ArrayList<String> arr1 = new ArrayList<String>();
	
	
	while(iter.hasNext())
	{
		//System.out.println(iter.next());
		arr1.add(iter.next());
		
	}
	
		Object copys = arr1.clone();
	
		System.out.println("***************************");
		System.out.println(copys);
	}

}
