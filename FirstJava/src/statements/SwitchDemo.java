package statements;

import java.util.Scanner;

public class SwitchDemo
{
		public static String noOfWheels()
		{	
			Scanner input = new Scanner(System.in);
			System.out.println("Type of Car is : Car/Bus/Truck/CNGAuto ");
			String carType = input.next();
			String wheelsNo = null;
			input.close();
			
			if(carType.equalsIgnoreCase("Car"))
			{
				wheelsNo = "No of wheels of " + carType + " are 4";
			}
			else if (carType.equalsIgnoreCase("Bus"))
			{
				wheelsNo = "No of wheels of " + carType + " are 6";
			}
			else if (carType.equalsIgnoreCase("Truck"))
			{
				wheelsNo = "No of wheels of " + carType + " are 8";
			}
			else if (carType.equalsIgnoreCase("CNGAuto"))
			{
				wheelsNo = "No of wheels of " + carType + " are 3";
			}
			return wheelsNo;
			
		}
		
		public static void main(String[] args) {
			
			String x =noOfWheels();
			System.out.println(x);
		}
}
