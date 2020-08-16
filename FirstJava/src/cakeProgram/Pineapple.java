package cakeProgram;

public class Pineapple extends Cake {
	
	 Pineapple() 
	{
		setCakeName("Pineapple");
		setCakeType("Egg less");
		setCakePrice(40);
		
	}

	@Override
	public void myFans() {
		
		System.out.println("Not only audult Kids also like me...........");
		System.out.println();
		
		
	}

	@Override
	public void recipe() {
		
		System.out.println(" Take a ripe fresh Pineapple and blend it.");
		System.out.println("mix flour backing powder in a bowl and mix it with warm milk");
		System.out.println("put the Pineapple blend to the mixer and mix again");
		System.out.println("bake it in 350 f for 35 minutes");
		System.out.println("get cool and enjoy...........");
		System.out.println();
	}

}
