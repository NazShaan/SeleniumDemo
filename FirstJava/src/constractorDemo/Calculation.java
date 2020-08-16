package constractorDemo;

public class Calculation {
	
	int a,b,c;
	
	public Calculation(int a, int b) {
		
		this.a = a;
		this.b = b;
	}

	public void Add()
	{
		c = a+b;
		System.out.println("The addition of  "+a +"  & "+ b +" is : "+c);
	}
	
	public void Sub()
	{
		c = b-a;
		System.out.println("The Substraction of  "+a +"  & "+ b +" is : "+c);
	}
	
	public static void main(String[] args) {
		
		Calculation ca = new Calculation(10,20);
		ca.Add();
		ca.Sub();
	}

}
