package cakeProgram;

import java.util.Scanner;

public class CakeTest {

	public static Cake cake = null;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What kind of cake you want to eat? BlackBerry/Pineapple");
		String choice = scanner.next();
		scanner.close();
		
		CakeFactory cakefactory = new CakeFactory();
		cake = cakefactory.createCake(choice);
		cake.aboutCake();
		

	}

}
