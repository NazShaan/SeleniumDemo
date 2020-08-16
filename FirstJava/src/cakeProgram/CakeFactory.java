package cakeProgram;

public class CakeFactory extends CakeTest implements Factory
{

	@Override
	public Cake CreateCake(String name) {
		if (name.equals("Pineapple")) 
		{
			 cake = new Pineapple();
			
		}
		else if (name.equals("BlackForest"))
		{
			
			 cake = new BlackForest();
			
		}
		else if(name.equals("BlueBerry"))
		{
			System.out.println("BlueBerry out of supply");
		}
		else
		{
			System.out.println("invalid choice!!!!!");
		}
		return cake;
	}
	
}
