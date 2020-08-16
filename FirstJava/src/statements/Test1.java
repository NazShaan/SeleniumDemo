package statements;

import accessModifier.ClassModifier;

public class Test1 extends ClassModifier {

			void m3()
			{
				System.out.println(" I am m3 from Test1");
			}
	
	
	public static void main(String[] args) {
		
		ClassModifier cm = new ClassModifier();
		cm.m2();
		
		Test1 cm1 = new Test1();
		cm1.m2();
		cm1.m3();
		
		
		
	}

}
