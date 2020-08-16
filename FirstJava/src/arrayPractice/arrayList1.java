package arrayPractice;

import java.util.ArrayList;

public class arrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> strl = new ArrayList<String>();
		
		strl.add("Syslhet");
		strl.add("Dhaka");
		strl.add("Khulna");
		strl.add("Comilla");
		strl.add("Chittagong");
		strl.add("Rajshahi");
		
		System.out.println(strl);
		// add another ciys name
		strl.add("Jessore");
		System.out.println(strl.size());
		
		// replace any city with another
		
		System.out.println(strl.indexOf("Comilla"));
		System.out.println(strl.get(3));
		strl.set(3, "Bogra");
		System.out.println(strl);
		
		strl.add("Sunamgonj");
		System.out.println(strl);
		
		System.out.println(!strl.isEmpty()); //true
		
		System.out.println(strl.contains("Sunamgonj"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
