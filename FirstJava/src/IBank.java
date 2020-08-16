
public class IBank implements Bdbank
{

	public static void main(String[] args) 
	{
		IBank ib = new IBank();
		ib.deposit();
		ib.withdrawal();
		System.out.println(ib.hashCode());
	}

	@Override
	public void deposit() {
		
		System.out.println("I am overriden deposit from IBank");
		
	}

	@Override
	public void withdrawal() {
		System.out.println("I am overriden withdrawal from IBank");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
