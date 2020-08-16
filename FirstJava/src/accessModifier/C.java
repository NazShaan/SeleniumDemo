package accessModifier;

public class C extends ClassModifier {
	
	void m4()
	{
		System.out.println("I am m4 from class C");
	}
	
	public void m5()
	{
		System.out.println("I am m5 from class C");
	}
	
	public static void main(String[] args) {
		ClassModifier cm3 = new ClassModifier();
		
		cm3.m1();
		
		C c = new C();
		c.m2();
		
	}

}
