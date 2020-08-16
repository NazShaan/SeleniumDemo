package cakeProgram;

public class CakeFactory extends CakeTest implements Factory {
	
	
	@Override
	public Cake createCake(String cakeName) {
		
		if(cakeName.equals("Pineapple"))
		{
			cake = new Pineapple();
		}
		else if (cakeName.equals("BlackBerry"))
		{
			cake = new BlackBerry();
		}
		return cake;
	}

	

	

}
