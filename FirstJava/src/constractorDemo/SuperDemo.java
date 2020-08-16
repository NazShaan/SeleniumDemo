package constractorDemo;

public class SuperDemo extends PatentClass {
	
	String address;
	
	
	
	public SuperDemo(String address)
	{
		this.address = address;
		System.out.println(address);
	}



	public static void main(String[] args) {
		SuperDemo sd = new SuperDemo("Bronx");
	}

}
