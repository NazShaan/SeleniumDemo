package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> h =  new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		
		System.out.println(h);
		
		System.out.println(h.contains(30));
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		lh.add(50);
		lh.add(60);
		lh.add(70);
		lh.add(80);
		lh.add(30);
		lh.add(50);
		
		System.out.println(lh);
		System.out.println("*********** copy Set object to another HashSet");
		
		HashSet<Integer> hc = (HashSet<Integer>) h.clone();
		System.out.println(hc);
	}

}
