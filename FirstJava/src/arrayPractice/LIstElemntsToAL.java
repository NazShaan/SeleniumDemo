package arrayPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIstElemntsToAL {

	public static void main(String[] args) {
		 ArrayList<String> arrl = new ArrayList<String>();
	        //adding elements to the end
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Actual ArrayList:"+arrl);
	        List<String> list = new ArrayList<String>();
	        list.add("one");
	        list.add("two");
	        arrl.addAll(list);
	        System.out.println("After Copy: "+arrl);
	        
	        
	       //***********************************************************
	        // Does ArrayList contains all elements
	      
	     boolean b =   arrl.containsAll(list);
	     System.out.println(b);
	     list.add("three");
	     list.add("four");
	     System.out.println("after adding elements to list"+list);
	     System.out.println(arrl.containsAll(list));
	     
	     
	     // How to copy ArrayList to Array
	     
	    
	     String[] str  = new String[arrl.size()] ;
	     arrl.toArray(str);
	     System.out.println("the length of my new Array is   "+str.length);
	    
	     for (String x:str)
	     {
	    	 System.out.println(x);
	     }
	}

}
