package constractorDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployMap 
{

	public static void main(String[] args) 
	{
		Employ e1 = new Employ(101, "Nazrul");
		Employ e2 = new Employ(102, "Nuraz");
		Employ e3 = new Employ(103, "Nabiha");
		Employ e4 = new Employ(104, "Shaan");
		
		Map<Integer, Employ> hasMap = new HashMap<Integer, Employ>();
		
		hasMap.put(e1.getEmpNo(), e1);
		hasMap.put(e2.getEmpNo(), e2);
		hasMap.put(e3.getEmpNo(), e3);
		hasMap.put(e4.getEmpNo(), e4);
		
		//print all the list using entrySet
		
		 Set<Entry<Integer, Employ>> entries = hasMap.entrySet();
		
		for(Entry<Integer, Employ> emp : entries)
		{
			Integer key = emp.getKey();
			System.out.println(key);
			Employ value = emp.getValue();
			value.diplay();
		}
	
		
		

	}

}
