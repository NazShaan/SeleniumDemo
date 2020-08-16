package constractorDemo;

public class Test {
	int numbers;
	String name;
	public Test()
	{
		System.out.println("this is no args const");
	}
	
	public Test(int numbers)
	{
		this.numbers = numbers;
		System.out.println("this is number "+this.numbers);
	}
	
	public Test(String name, int numbers) {
		//Test(123);
		this.numbers= numbers;
		this.name=name;
		System.out.println(this.numbers +"---"+this.name);
		
	}

	public static void main(String[] args) {
		Test t2 = new Test("shaan", 2351);
		
	}

}
