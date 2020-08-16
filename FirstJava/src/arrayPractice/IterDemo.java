package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IterDemo {

	public static void main(String[] args) {

		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("Java");
		arrl.add("Python");
		arrl.add("Java Script");
		arrl.add("Ruby");
		arrl.add("C#");
		
		ListIterator<String> li = arrl.listIterator();
		while (li.hasNext()) {
			String val = (String) li.next();
			System.out.println(val);
			
			if (val.equalsIgnoreCase("java")) {
				li.set("Hello");
			} else {
				li.remove();

			}
			
		}
		// convert Array to List
		Integer[] arr = {3,4,3,6,7,2,7,8,9,10};
		
		List<Integer> list =( List<Integer>)Arrays.asList(arr);
		
		System.out.println(list);

	
		
		
		
	}

}
