
public class PrimeBank implements Bdbank
{

	public static void main(String[] args)
	{
		PrimeBank pb = new PrimeBank();
		pb.deposit();
		pb.withdrawal();
		System.out.println(pb.hashCode());
	}

	@Override
	public void deposit() {
		System.out.println("I am overriden deposit from PrimeBank");
		
	}

	@Override
	public void withdrawal() {
		
		System.out.println("I am overriden withdrawal from PrimeBank");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
