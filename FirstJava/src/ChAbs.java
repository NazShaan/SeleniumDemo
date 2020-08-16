
public class ChAbs extends FAbs

{

	public static void main(String[] args) 
	{
		
		ChAbs ca = new ChAbs();
		System.out.println(ca.eName);
		System.out.println(ca.eNo);
		ca.m1();
		ca.m2();
		System.out.println("++++++++++++++");
		
		FAbs ca1 = new ChAbs();
		ca1.m1();
		

	}
	void m1()
	{
		System.out.println("I am overriden m1 from childclass");
	}

	@Override
	void m2() {
		
		System.out.println(" I am m2 abstract method called from ChAbs");
		
	}
	

}
