package codeSample;

import java.text.DecimalFormat;
import java.util.Scanner;
 

public class ParkingCost {

	
	public static double calculateCharges(double numHoursPartial)
	{
	
		double Cost_For_First_Hours = 2;
		int Num_Of_First_Hour = 3;
		final int Max_Daily_Cost = 10;
		
		double numHoursFull = Math.ceil(numHoursPartial);
				
		double parkingCharge = 0;
		if (numHoursFull <= Num_Of_First_Hour) {
			return Cost_For_First_Hours;
		}
		
		parkingCharge = 2 + 0.5 * (numHoursFull - 3);
		
		return Math.min(parkingCharge,Max_Daily_Cost);
		
		
	}
	
	
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$##.00");
		
		System.out.println("Enter the number of cars parked yesterday");
		final int num_cars = keyboard.nextInt();
		
		double hoursParked = 0;
		double currentCost = 0;
		double totalCost = 0;
		
		for (int count= 1; count<= num_cars;count++)
		{
			System.out.println("Enter the number of hours parked for car "+ count);
			hoursParked = keyboard.nextDouble();
			currentCost = calculateCharges(hoursParked);
			System.out.println("Parking charges due for car " + count + " is " + formatter.format(currentCost));
			totalCost += currentCost;
			System.out.println("Running cost is " + formatter.format(totalCost));
			
		}
		keyboard.close();
	
	}


}
