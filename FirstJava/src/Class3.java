import constractorDemo.Calculation;
public class Class3 extends Calculation {

	public Class3(int a, int b) {
		super(a, b);
	
	}

	public static void main(String[] args) {
		
		Class3 c3 = new Class3(45,85);
		c3.Add();
		c3.Sub();

	}

}
