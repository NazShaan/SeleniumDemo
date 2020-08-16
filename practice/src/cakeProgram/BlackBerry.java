package cakeProgram;

public class BlackBerry extends Cake{

	BlackBerry()
	{
		setName("BlackBerry");
		setType("With Egg.");
		setPrice(50);
	}
	@Override
	public void recipe() {
		System.out.println(" BlackBerry cake's recipe given below: ");
		System.out.println("belnd BlackBerry");
		System.out.println("Add flour, suger, bakcing powder.");
		System.out.println("Bake for 50 minutes and enjoy.");
		
	}

	@Override
	public void myFan() {
		
		System.out.println("Blackberry lover like me.");
		
	}

}
