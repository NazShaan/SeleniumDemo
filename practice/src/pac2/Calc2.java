package pac2;

import pac1.Calculation;

public class Calc2 extends Calculation
{

	public Calc2(int a, int b) {
		super(a, b);
		
	}
	
	public static void main(String[] args) {
		
		Calc2 obj = new Calc2(2000,1000);
		obj.add();
		obj.sub();
	}

}
