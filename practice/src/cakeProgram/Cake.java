package cakeProgram;

public abstract class Cake {
	
	private static String name;
	private static String type;
	private static int price;
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Cake.name = name;
	}
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		Cake.type = type;
	}
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		Cake.price = price;
	}
	
	public void aboutCake()
	{
		System.out.println("I am "+name );
		recipe();
		System.out.println("My fans are.....");
		myFan();
		System.out.println("you can get " + name + " for $ "+price);
	}

	public abstract void recipe();
	public abstract void myFan();
	
}
