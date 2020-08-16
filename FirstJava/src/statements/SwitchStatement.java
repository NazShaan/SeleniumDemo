package statements;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		/*
		String cityName;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the city name");
		cityName = input.next();
		
					switch (cityName) {
					
					case "sylhet":
						System.out.println("Kita khobor vala ni");
						break;
					case "dhaka":
						System.out.println("Ki khobor valo ashen?");
					case "comilla":
						System.out.println("anner khobor kita, vala ni?");
					case "chittagonj":
						System.out.println("anner khobor vala niooo");
					default:
						System.out.println("please try different city name");
						//break;
					}
			*/
	
		
		//copy range of elements from the array
		Integer[] arr1 = {2,4,5,7,12,11,4,33,45};
	
	Integer[] arr2 = Arrays.copyOfRange(arr1, 2, 8);
	for(int x:arr2)
	{
		System.out.print(x+",  ");
	}
		
		// sortin an array
	Arrays.sort(arr1);
	for(int y:arr1)
	{
		System.out.print(y+",  ");
	}
		
	}
	

}
