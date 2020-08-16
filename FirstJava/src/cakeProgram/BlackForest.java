package cakeProgram;

public class BlackForest extends Cake{

	BlackForest()
	{
		setCakeName("BalckForest");
		setCakeType("No Suger");
		setCakePrice(50);
	}
	
	@Override
	public void myFans() {
		
		
		System.out.println("My mother like it");
		System.out.println();
		
	}

	@Override
	public void recipe() {
		System.out.println(" 1. Take all purpose flour, milk, chocklate and milk.");
		System.out.println("2. Mix it well");
		System.out.println("3. Bake it at 350 F for 50 minutes.");
		System.out.println("4. Get it cool and enjoy!!");
	}
	


}
