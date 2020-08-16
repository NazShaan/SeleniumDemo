package pac1;

public class Calc1 extends Calculation
{

	public Calc1(int a, int b) {
		super(a, b);
		
	}

	public static void main(String[] args) 
	{
		Calc1 obj = new Calc1(200,100);
		obj.add();
		obj.sub();

	}

}
