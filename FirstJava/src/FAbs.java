
public abstract class FAbs {
	
	int eNo = 1745;
	String eName;
	
	void m1()
	{
		System.out.println(" m1 from FAbs     "+eNo);
	}
	
	abstract void m2();
	
	public static void main(String[] args) {
		
		//FAbs = new FAbs();
		
		FAbs fa;
	fa =	new ChAbs();
	fa.m1();
	fa.m2();
		
		

	}

}
