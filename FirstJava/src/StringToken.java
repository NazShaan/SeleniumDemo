import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		
		String str = "https://10.30.200.999";
		StringTokenizer stk = new StringTokenizer(str,"://.");
		
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}

	}

}
