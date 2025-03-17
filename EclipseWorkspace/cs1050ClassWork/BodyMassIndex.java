/**
 * Calculate the BMI using formula in US units
 * Use will enter weight in pounds and height in inches
 */
import java.util.Scanner; 

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		//constants
		final int BMI_US_FACTOR = 703; //factor formula in pounds
		// Variables
		double weight; // The user's weight
		double height; // The user's height
		double bmi; // The user's BMI

		// Create a Scanner object for scanning input from keyboard 
		// Name object variable input 
		Scanner input = new Scanner(System.in);

		

		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index (BMI)");
		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		// input next double for weight
		weight = input.nextDouble();
		
		
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		// input next double for height
		height = input.nextDouble();
		
		
		// Calculate the user's body mass index.
		bmi = weight * BMI_US_FACTOR / (height * height);
		
		
		// Display the user's BMI.
		System.out.println("Weight: " + weight + " Height: " + height);
		
		System.out.printf("Your body mass index (BMI) is %f", bmi);

		// Displaying BMI category (using a Mutli-Way if)
		if(bmi <= 18.4) 
		{
			System.out.println("  Your category: Underweight");
		}	
		else if(bmi >= 18.5 && bmi <= 24.9)
		{
			// 18.5 - 24.9 is the range for Normal
			System.out.println("  Your category: Normal");
			
		}
		else if(bmi >= 25.0 && bmi <= 39.9)
		{
			// 25.0 - 39.9 is the range for Overweight
			System.out.println("  Your category: Overweight");
			
		}
		else if(bmi >= 40.0)
		{
			System.out.println("  Your category: Obese");
			
		}
		else 
		{
			System.out.println("No Data");

		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		// End Scanner
		input.close();
	}
}
