package pac3;

import pac1.Calculation;

public class Calc4 extends Calculation
{

	public Calc4(int a, int b) {
		super(a, b);
		
	}

	public static void main(String[] args) 
	{
		Calc4 obj = new Calc4(40,30);
		obj.add();
		obj.sub();
	}

}
