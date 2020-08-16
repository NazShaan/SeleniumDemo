package cakeProgram;

public class Pineapple extends Cake {
	
	Pineapple()
	{
		setName("Pineapple");
		setType("Egg Less");
		setPrice(35);
	}

	@Override
	public void recipe() {
		System.out.println("Pineapple cake recipe is given below...");
		System.out.println("blend pineapple");
		System.out.println("add 3 cups of flour, 1 cups suger, salt to taste, 1 tsp backing powder.");
		System.out.println("bake for 35 minutes at 450 F .");
		
	}

	@Override
	public void myFan() {
		System.out.println("Pineapple lover like me.");
		
	}
}
