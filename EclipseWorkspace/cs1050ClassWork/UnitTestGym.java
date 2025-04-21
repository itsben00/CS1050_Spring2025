
import java.util.Scanner;
public class UnitTestGym {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double[] dailyCals = getDailyCalories(input);
		
	}//END of main

	
	
	
	
	public static double[] getDailyCalories(Scanner scanKeyboard)
	{
		
		double[] calsArray = new double[7];
		
		int dayNum = 1;
		
		for(int i = 0; i < calsArray.length; i++)
		{
			System.out.print("Enter calories burned on day " + dayNum + ":");
			dayNum++;
			
			calsArray[i] = scanKeyboard.nextDouble();	
		}
		
		return calsArray;
	}//END of getDailyCalories
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
