package cakeProgram;

import java.util.Scanner;

public class CakeTest {
	
	public static Cake cake = null;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What type of cake would you like: BlackForest/Pineapple/BlueBerry");
		String choice = input.next();
		input.close();
		
		CakeFactory cakefactory = new CakeFactory();
		cake = cakefactory.CreateCake(choice);
		cake.aboutCake();
		
		
		
	}

	

}
