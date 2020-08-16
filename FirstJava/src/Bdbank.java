
public interface Bdbank 
{
		void deposit();
		void withdrawal();
		
		void m1();
		public static void main(String[] args) 
		{
			
			Bdbank bb;
		bb =	new PrimeBank();
		bb.deposit();
		System.out.println(bb.hashCode());
		bb.withdrawal();
		
		
		bb = new IBank();
		bb.deposit();
		bb.withdrawal();
		
		}
}
